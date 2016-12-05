package dal;

import java.util.ArrayList;
import java.util.List;
import model.MateriaPrima;
import model.Receita;

public class conexaoList {

    private static List<MateriaPrima> materiaPrima;
    private static List<Receita> receitas;

    public static List<MateriaPrima> getMateriaPrima() {
        return materiaPrima;
    }

    public static List<Receita> getReceitas() {
        return receitas;
    }

    public static void getConection() {
        receitas = new ArrayList<Receita>();
        materiaPrima = new ArrayList<MateriaPrima>();
    }
}
