package view;

import java.util.Scanner;

public class MainView {

    private static Scanner scan = new Scanner(System.in);

    public static int menu() {
        int opc;

        System.out.println(" 99 - Sair do Sistema:");
        System.out.println("");
        System.out.print("Informe a opção desejada:");
        opc = scan.nextInt();
        scan.nextLine();

        System.out.println("");
        return opc;
    }

}
