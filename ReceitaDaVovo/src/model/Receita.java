package model;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    private int codigo;
    private List<MateriaPrima> ingredientes;
    private String nome;
    private String modoPrepraro;
    
    public Receita(int cod, ArrayList<MateriaPrima> ingredientes, String nome, String preparo){
        this.ingredientes = new ArrayList<MateriaPrima>();
        
        this.setCodigo(codigo);
        this.setIngredientes(ingredientes);
        this.setNome(nome);
        this.setModoPrepraro(modoPrepraro);
    }

    public String getModoPrepraro() {
        return modoPrepraro;
    }

    public void setModoPrepraro(String modoPrepraro) {
        this.modoPrepraro = modoPrepraro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<MateriaPrima> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<MateriaPrima> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
}
