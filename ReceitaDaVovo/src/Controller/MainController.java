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
                    new ReceitaView().adicionar();
                    break;

                case 2:
                    new ReceitaView().listarTodos();
                    break;

                case 3:
                    new ReceitaView().buscar();
                    break;

                case 4:
                    new ReceitaView().excluir();
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
                    
                default:
                    new MainView().mensagem();
                    
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

        MateriaPrima fuba = new MateriaPrima();
        fuba.setNome("Fuba");
        fuba.setCodigo(6);
        conexaoList.getMateriaPrima().add(fuba);

        MateriaPrima cenoura = new MateriaPrima();
        cenoura.setNome("Cenoura");
        cenoura.setCodigo(6);
        conexaoList.getMateriaPrima().add(cenoura);

        MateriaPrima acucar = new MateriaPrima();
        acucar.setNome("Açucar");
        acucar.setCodigo(6);
        conexaoList.getMateriaPrima().add(acucar);
    }

    private static void motorReceita() {
        try{
        for (int i = 0; i < 1; i++) {
            ArrayList<String> ingredientes = new ArrayList<>();
            ingredientes.add(motorCriarClasseReceita("leite", "copo", 3.5));
            ingredientes.add(motorCriarClasseReceita("trigo", "gramas", 400));
            ingredientes.add(motorCriarClasseReceita("ovo", "unidade", 3));
            ingredientes.add(motorCriarClasseReceita("oleo", "copo", 0.5));

            Receita r = new Receita(ingredientes, "Bolo de Fuba", "1ajlskdjasnaiovonasoiansdjhascbasvnoiashb");
            conexaoList.getReceitas().add(r);
        }

        ///////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 1; i++) {
            ArrayList<String> ingredientes = new ArrayList<>();
            ingredientes.add(motorCriarClasseReceita("leite", "copo", 2));
            ingredientes.add(motorCriarClasseReceita("trigo", "Kilograma", 1));
            ingredientes.add(motorCriarClasseReceita("ovo", "unidade", 5));
            ingredientes.add(motorCriarClasseReceita("oleo", "copo", 0.5));
            ingredientes.add(motorCriarClasseReceita("cenoura", "unidade", 4));

            Receita r1 = new Receita(ingredientes, "Bolo de Cenoura", "2ajlskdjadasgasvasaasnaiovonasoiansdjhascbasvnoiashb");
            conexaoList.getReceitas().add(r1);
        }

        ///////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 1; i++) {
            ArrayList<String> ingredientes = new ArrayList<>();
            ingredientes.add(motorCriarClasseReceita("leite", "copo", 3.5));
            ingredientes.add(motorCriarClasseReceita("trigo", "gramas", 400));
            ingredientes.add(motorCriarClasseReceita("ovo", "unidade", 3));
            ingredientes.add(motorCriarClasseReceita("oleo", "copo", 0.5));
            ingredientes.add(motorCriarClasseReceita("açucar", "copo", 0.5));

            Receita r2 = new Receita(ingredientes, "Bolo de Louco", "3ajlskdjasnaiovonasoiansdjhascbasvnoiashb");
            conexaoList.getReceitas().add(r2);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static String motorCriarClasseReceita(String ing, String medida, double quantidade) {
        String materia = null;

        try {
            for (MateriaPrima mp : conexaoList.getMateriaPrima()) {
                if (mp.getNome().equalsIgnoreCase(ing)) {
                    materia = mp.getNome() + " " + quantidade + " " + medida;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return materia;
    }
}
