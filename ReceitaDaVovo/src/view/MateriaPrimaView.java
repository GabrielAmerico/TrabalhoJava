package view;

import java.util.Scanner;

public class MateriaPrimaView {

    private static Scanner scan = new Scanner(System.in);

    public static void menu() {
        System.out.println(" 9 - Adicionar  Materia Prima:");
        System.out.println(" 10 - Ver Todas as Materias Primas:");
        System.out.println(" 11 - Pesquisar Materia Prima:");
        System.out.println(" 12 - Excluir Materia Prima:");
        System.out.println("");
    }

    public void adicionar() {        
        String nomeMateria;
        System.out.println("Cadastrando Materia Prima ...");
        System.out.println("");
        System.out.print("Informe o nome da Materia Prima:");
        nomeMateria = scan.nextLine();
        
        new MateriaPrimaView().adicionar();
    }

}
