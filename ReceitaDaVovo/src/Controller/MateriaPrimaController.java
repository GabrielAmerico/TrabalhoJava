package Controller;

import dal.conexaoList;
import javax.swing.JOptionPane;
import model.MateriaPrima;

public class MateriaPrimaController {

    public static void adicionar(String nome) {
        int cod;

        cod = conexaoList.getMateriaPrima().size() + 1;
        conexaoList.getMateriaPrima().add(new MateriaPrima(cod, nome));

    }

    public static MateriaPrima buscar(String nome) {
        for (MateriaPrima matP : conexaoList.getMateriaPrima()) {
            if (matP.getNome().equalsIgnoreCase(nome)) {
                return matP;
            }
        }
        return null;
    }

    public static boolean excluir(String nome) {
        MateriaPrima matP;

        matP = buscar(nome);

        if (matP != null) {
            conexaoList.getMateriaPrima().remove(matP);
            return true;
        } else {
            return false;
        }

    }

}
