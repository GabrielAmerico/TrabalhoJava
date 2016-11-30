package Controller;

import java.util.Scanner;
import model.Receita;
import view.IngredientesMedidaView;
import view.MainView;
import view.MateriaPrimaView;
import view.ReceitaView;

public class MainController {

    public static void main(String[] args) {
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
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;
            }
        } while (opc != 99);
    }

}
