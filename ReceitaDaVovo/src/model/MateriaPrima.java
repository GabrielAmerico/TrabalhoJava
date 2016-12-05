package model;

public class MateriaPrima {
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public MateriaPrima(int cod, String nome){
        this.setCodigo(cod);
        this.setNome(nome);
    }
    
    public MateriaPrima(){
        
    }
}
