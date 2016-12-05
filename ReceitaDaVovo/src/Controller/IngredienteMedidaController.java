package Controller;

import dal.conexaoList;
import model.IngredienteMedida;
import model.MateriaPrima;

public class IngredienteMedidaController extends Heranca.ControllerHeranca{

    public static boolean adicionar(String nomeIngrediente) {
int cod;
MateriaPrima materia;

        cod = conexaoList.getIngredientes().size() + 1;
        try {
            conexaoList.getIngredientes().add(new IngredienteMedida(cod,materia,medida,quantidade));
            return true;
        } catch (Exception e) {
            return false;
        }    }
    
}
