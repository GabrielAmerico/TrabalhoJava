package Controller;

import dal.conexaoList;
import java.util.Scanner;
import model.MateriaPrima;
import model.Receita;
import view.IngredientesMedidaView;
import view.MainView;
import view.MateriaPrimaView;
import view.ReceitaView;

public class MainController {

    public static void main(String[] args) {
        conexaoList.getConection();
        motorPrima();
        exibirMenu();
    }

    public static void exibirMenu() {
        int opc;
        
        do {
            ReceitaView.menu();
            IngredientesMedidaView.menu();
            MateriaPrimaView.menu();
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
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    new MateriaPrimaView().adicionar();
                    break;

                case 10:
                    new MateriaPrimaView().listarTodos();
                    break;

                case 11:
                    new MateriaPrimaView().buscar();
                    break;

                case 12:
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

}
