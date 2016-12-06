package model;

import dal.conexaoList;
import java.util.ArrayList;
import java.util.List;

public class Receita {

    private int codigo;
    private List<String> ingredientes;
    private String nome;
    private String modoPrepraro;

    public Receita(ArrayList<String> ingredientes, String nome, String preparo) {
        this.ingredientes = new ArrayList<String>();
        int cod = conexaoList.getReceitas().size() + 1;
        
        this.setCodigo(cod);
        this.setIngredientes(ingredientes);
        this.setNome(nome);
        this.setModoPrepraro(preparo);
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

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
