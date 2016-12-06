package view;

import Controller.ReceitaController;
import dal.conexaoList;
import interfaces.PadraoView;
import java.util.ArrayList;
import java.util.Scanner;
import model.MateriaPrima;
import model.Receita;

public class ReceitaView implements PadraoView {
    private static Scanner scan = new Scanner(System.in);

    @Override
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
    public void adicionar() {
        int rep=0;
        String nomeReceita;
        ArrayList<String> nomeMateria = new ArrayList<>();
        String nomeMedida = null;
        float quantidade = 0;
        String preparo;
        String mp;
        
        
        System.out.println("Cadastrando Receita ...");
        
        System.out.println("");
        System.out.print("Informe o nome da Receita:");
        System.out.println("");        
        nomeReceita = scan.nextLine();
        
        new MateriaPrimaView().listarTodos();
        
        System.out.println("");
        do{
            System.out.println("Informe o nome da matéria prima...");
            System.out.println("");
            mp = new MateriaPrimaView().buscarNome();
            if(mp != null){
                System.out.println("");
                System.out.println("Informe a unidade de medida...");
                System.out.println("");
                nomeMedida = scan.nextLine();

                System.out.println("");
                System.out.println("Informe a quantidade relativa da medida...");
                System.out.println("");
                quantidade = scan.nextInt();
                scan.nextLine();
                   
                        nomeMateria.add(mp+" "+quantidade+" "+nomeMedida);
            }else{
                System.out.println("Materia Prima Não Encontrada!");
            }
            System.out.println("Deseja adicionar outra materia prima?...   1= Sim / 0= Não");
            rep = scan.nextInt();
            scan.nextLine();
        }while(rep == 0);
        
        
        System.out.println("");
        System.out.println("Descreva o modo de preparo...");
        System.out.println("");
        preparo = scan.nextLine();
        
        boolean retorno = ReceitaController.adicionar(nomeMateria, nomeReceita, preparo, nomeMedida, quantidade);

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
    
    @Override
    public void listarTodos() {
        for (Receita r : conexaoList.getReceitas()) {
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("Código: " + r.getCodigo());
            System.out.println("Nome da Receita: " + r.getNome());
            /*for (IngredienteMedida ing : r.getIngredientes()) {
                System.out.println("Ingrediente: " + ing.getIngrediente().getNome() + "-- Quantidade: " + ing.getQuantidade() + " " + ing.getTipoDeMedida());
            }*/
            System.out.println("Modo de Preparo: " + r.getModoPrepraro());
            System.out.println("----------------------------------------");
        }
    }

    @Override
    public void buscar() {

    }

    @Override
    public String buscarNome() {
        return "";
    }

    @Override
    public void excluir() {

    }

    }
