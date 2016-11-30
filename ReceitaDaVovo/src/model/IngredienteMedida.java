package model;

public class IngredienteMedida {
    private int codigo;
    private MateriaPrima ingrediente;
    private String tipoDeMedida;
    private float quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public MateriaPrima getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(MateriaPrima ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getTipoDeMedida() {
        return tipoDeMedida;
    }

    public void setTipoDeMedida(String tipoDeMedida) {
        this.tipoDeMedida = tipoDeMedida;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
