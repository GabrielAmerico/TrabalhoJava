package model;

import java.util.List;

public class Receita {
    private int codigo;
    private List<IngredienteMedida> ingredientes;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<IngredienteMedida> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteMedida> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
}
