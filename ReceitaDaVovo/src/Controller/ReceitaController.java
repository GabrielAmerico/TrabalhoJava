package Controller;

import dal.conexaoList;
import java.util.ArrayList;
import model.MateriaPrima;
import model.Receita;

public class ReceitaController extends Heranca.ControllerHeranca {

    public static boolean adicionar( ArrayList<String> nomeMateria, String nomeReceita, String preparo, String nomeMedida, float quantidade) {
        
        int cod;
        cod = conexaoList.getReceitas().size() + 1;
        
        try {
            conexaoList.getReceitas().add(new Receita(cod, nomeMateria, nomeReceita, preparo, nomeMedida, quantidade));
            return true;
        } catch (Exception e) {
            return false;
        }

        
    }
   
}
