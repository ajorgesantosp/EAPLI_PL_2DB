
package Persistence;

import Model.DebitCard;
import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe repositorio para armazenar os cartões de debito
 * 
 * @author nbento
 */
public class DebitCardRepository {

    private static List<DebitCard> listDebitCards = new ArrayList<DebitCard>();
    
    public DebitCardRepository(){}
    
    /**
     * Adicionar uma novo cartão de debito no repositorio
     * 
     * @param dc - Objeto cartão de debito
     */
    public void save(DebitCard dc){
        if (dc==null) throw new IllegalArgumentException();
        listDebitCards.add(dc);
    }
    
    /**
     * Devolve todos os cartões de debito do repositorio
     * 
     * @return Lista completa dos cartões de debito
     */
    public List<DebitCard> getAllDebitCard(){
        return listDebitCards;
    }
    
    
}
