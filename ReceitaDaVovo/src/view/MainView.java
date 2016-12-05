package view;

import java.util.Scanner;

public class MainView {

    private static Scanner scan = new Scanner(System.in);

    public static int menu() {
        int opc = 0;
        boolean loop = true;

        System.out.println(" 99 - Sair do Sistema:");
        System.out.println("");
        System.out.print("Informe a opção desejada:");
        try {
            opc = scan.nextInt();
        } catch (Exception e) {
            System.out.println("---------------------------------------------");
            System.out.println("Erro: " + e.getMessage() + " -- Informe apenas numeros");
            System.out.println("---------------------------------------------");
            opc = 0;
        }

        scan.nextLine();
        System.out.println("");
        return opc;

    }
}
