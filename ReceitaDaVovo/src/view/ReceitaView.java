package view;

import dal.conexaoList;
import interfaces.PadraoView;
import model.Receita;

public class ReceitaView implements PadraoView {

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

    }

    @Override
    public void listarTodos() {
        for (Receita r : conexaoList.getReceitas()) {
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("Código: "); 
            System.out.println("Nome Materia Prima: " );
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
