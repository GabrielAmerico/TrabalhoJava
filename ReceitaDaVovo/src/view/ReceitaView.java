package view;

import Controller.ReceitaController;
import dal.conexaoList;
import interfaces.PadraoView;
import java.util.ArrayList;
import java.util.Scanner;
import model.Receita;

public class ReceitaView implements PadraoView {

    private static Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.println("");
        System.out.println("");
        System.out.println(" 1 - Adicionar  Receitas:");
        System.out.println(" 2 - Ver Todas as receitas:");
        System.out.println(" 3 - Pesquisar Receita:");
        System.out.println(" 4 - Excluir receita");
        System.out.println("");
    }

    @Override
    public void listarTodos() {
        for (Receita r : conexaoList.getReceitas()) {
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("Código: " + r.getCodigo());
            System.out.println("Nome da Receita: " + r.getNome());
            for (String ing : r.getIngredientes()) {
                System.out.println("Ingrediente: " + ing);
            }
            System.out.println("Modo de Preparo: " + r.getModoPrepraro());
            System.out.println("----------------------------------------");
        }
    }

    @Override
    public void buscar() {
        String nomeReceita;
        Receita receita;

        nomeReceita = buscarNome();

        receita = ReceitaController.buscar(nomeReceita);

        if (receita != null) {
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("Código: " + receita.getCodigo());
            System.out.println("Nome da Receita: " + receita.getNome());
            for (String ing : receita.getIngredientes()) {
                System.out.println("Ingrediente: " + ing);
            }
            System.out.println("Modo de Preparo: " + receita.getModoPrepraro());
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Receita não encontrada!");
            System.out.println("----------------------------------------");
        }
    }

    @Override
    public String buscarNome() {
        System.out.println("Buscando Receita....");
        System.out.println("");
        System.out.print("Informe o nome da receita: ");
        String nome = scan.nextLine();

        return nome;
    }

    @Override
    public void excluir() {
        String nome;
        boolean receita;

        nome = buscarNome();
        receita = ReceitaController.excluir(nome);

        if (receita) {
            System.out.println("----------------------------------------");
            System.out.println("Receita excluida com Sucesso!");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Erro ao excluir receita!");
            System.out.println("----------------------------------------");
        }
    }

    @Override
    public void adicionar() {
        int rep = 0;
        String nomeReceita;
        ArrayList<String> nomeMateria = new ArrayList<>();
        String nomeMedida = null;
        float quantidade = 0;
        String preparo;
        String mp;

        System.out.println("Cadastrando Receita ...");

        System.out.println("");
        System.out.print("Informe o nome da Receita:");
        nomeReceita = scan.nextLine();
        System.out.println("");

        do {
            new MateriaPrimaView().listarTodos();
            mp = new MateriaPrimaView().buscarNome();
            if (mp != null) {
                System.out.println("");
                System.out.print("Informe a unidade de medida...");
                nomeMedida = scan.nextLine();
                System.out.println("");

                System.out.println("");
                System.out.print("Informe a quantidade relativa da medida...");
                quantidade = scan.nextInt();
                System.out.println("");
                scan.nextLine();

                nomeMateria.add(mp + " " + quantidade + " " + nomeMedida);
            } else {
                System.out.println("Materia Prima Não Encontrada!");
            }
            System.out.println("Deseja adicionar outra materia prima?...   1= Sim / 0= Não");
            rep = scan.nextInt();
            scan.nextLine();
        } while (rep != 0);

        System.out.println("");
        System.out.print("Descreva o modo de preparo...");
        System.out.println("");
        preparo = scan.nextLine();

        boolean retorno = ReceitaController.adicionar(nomeMateria, nomeReceita, preparo);

        if (retorno) {
            System.out.println("----------------------------------------");
            System.out.println("Receita " + nomeReceita + " adicionado com sucesso");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Falha ao adicionar a Receita");
            System.out.println("----------------------------------------");
        }
    }

}
