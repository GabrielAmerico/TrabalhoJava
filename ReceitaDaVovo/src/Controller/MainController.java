package Controller;

import dal.conexaoList;
import java.util.ArrayList;
import model.MateriaPrima;
import model.Receita;
import view.MainView;
import view.MateriaPrimaView;
import view.ReceitaView;

public class MainController {

    public static void main(String[] args) {
        conexaoList.getConection();
        motorPrima();
        motorReceita();
        exibirMenu();
    }

    public static void exibirMenu() {
        int opc;

        do {
            new ReceitaView().menu();
            new MateriaPrimaView().menu();
            opc = MainView.menu();

            switch (opc) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    new MateriaPrimaView().adicionar();
                    break;

                case 6:
                    new MateriaPrimaView().listarTodos();
                    break;

                case 7:
                    new MateriaPrimaView().buscar();
                    break;

                case 8:
                    new MateriaPrimaView().excluir();
                    break;
            }
        } while (opc != 99);
    }

    private static void motorPrima() {
        MateriaPrima ovo = new MateriaPrima();
        ovo.setNome("Ovo");
        ovo.setCodigo(1);
        conexaoList.getMateriaPrima().add(ovo);

        MateriaPrima trigo = new MateriaPrima();
        trigo.setNome("Trigo");
        trigo.setCodigo(2);
        conexaoList.getMateriaPrima().add(trigo);

        MateriaPrima oleo = new MateriaPrima();
        oleo.setNome("Oleo");
        oleo.setCodigo(3);
        conexaoList.getMateriaPrima().add(oleo);

        MateriaPrima sal = new MateriaPrima();
        sal.setNome("Sal");
        sal.setCodigo(4);
        conexaoList.getMateriaPrima().add(sal);

        MateriaPrima leite = new MateriaPrima();
        leite.setNome("Leite");
        leite.setCodigo(5);
        conexaoList.getMateriaPrima().add(leite);
    }

    private static void motorReceita() {
        ArrayList<MateriaPrima> ingredientes = null;

        Receita r = new Receita(1, ingredientes, "Bolo de Fuba", "dklajsdlaksjfkalsf");
        conexaoList.getReceitas().add(r);

        Receita r1 = new Receita(1, ingredientes, "Bolo de cenoura", "dklajsdlaksjfkalsf");
        conexaoList.getReceitas().add(r1);

        Receita r2 = new Receita(1, ingredientes, "Lasanha", "dklajsdlaksjfkalsf");
        conexaoList.getReceitas().add(r2);

        Receita r3 = new Receita(1, ingredientes, "Pudim", "dklajsdlaksjfkalsf");
        conexaoList.getReceitas().add(r3);
    }

}
