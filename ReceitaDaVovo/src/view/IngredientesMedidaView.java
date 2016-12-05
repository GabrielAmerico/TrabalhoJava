package view;

import Controller.IngredienteMedidaController;
import dal.conexaoList;
import interfaces.PadraoView;
import java.util.Scanner;
import model.MateriaPrima;

public class IngredientesMedidaView implements PadraoView{
        
        private static Scanner scan = new Scanner(System.in);

        @Override
    public void menu(){
        System.out.println(" 5 - Adicionar  Ingredientes:");
        System.out.println(" 6 - Ver Todos os Ingrediente:");
        System.out.println(" 7 - Pesquisar Ingrediente:");
        System.out.println(" 8 - Excluir Ingrediente:");
        System.out.println("");
    }
    
        @Override
    public void adicionar(){
        String nomeIngrediente;
        System.out.println("Cadastrando Ingrediente ...");
        System.out.println("");
        
        new MateriaPrimaView().listarTodos();
        
        System.out.print("Informe o nome da matéria prima:");
        nomeIngrediente = scan.nextLine();
        
        IngredienteMedidaController.adicionar(nomeIngrediente);
    }

    @Override
    public void listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
