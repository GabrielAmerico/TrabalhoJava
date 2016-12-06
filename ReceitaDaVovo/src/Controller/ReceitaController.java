package Controller;

import dal.conexaoList;
import java.util.ArrayList;
import model.Receita;

public class ReceitaController extends Heranca.ControllerHeranca {

    public static boolean adicionar(ArrayList<String> nomeMateria, String nomeReceita, String preparo) {

        
        try {
            conexaoList.getReceitas().add(new Receita(nomeMateria, nomeReceita, preparo));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static Receita buscar(String nome) {
        for (Receita r : conexaoList.getReceitas()) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                return r;
            }
        }
        return null;
    }

    public static boolean excluir(String nome) {
        Receita r;

        r = buscar(nome);

        if (r != null) {
            conexaoList.getReceitas().remove(r);
            return true;
        } else {
            return false;
        }

    }
}
