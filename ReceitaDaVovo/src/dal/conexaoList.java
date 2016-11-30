package dal;

import java.util.ArrayList;
import java.util.List;
import model.IngredienteMedida;
import model.MateriaPrima;
import model.Receita;

public class conexaoList {

    private static List<MateriaPrima> materiaPrima;
    private static List<IngredienteMedida> ingredientes;
    private static List<Receita> receita;

    public static List<MateriaPrima> getMateriaPrima() {
        return materiaPrima;
    }

    public static List<IngredienteMedida> getIngredientes() {
        return ingredientes;
    }

    public static List<Receita> getReceita() {
        return receita;
    }

    public static void getConection() {
        receita = new ArrayList<Receita>();
        materiaPrima = new ArrayList<MateriaPrima>();
        ingredientes = new ArrayList<IngredienteMedida>();
    }
}
