package Controllers;

import Model.ExpenseType;
import Model.DebitCard;
import Persistence.DebitCardRepository;
import Persistence.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author nbento
 */
public class ExpenseDebitCardController {

    public List<ExpenseType> getExpenseType() throws IllegalArgumentException{
       
       List<ExpenseType> expenseTypes;
       
       ExpenseTypeRepository expenseTypeRepository = new ExpenseTypeRepository();
       
       //Lista completa dos tipos de despesas
       expenseTypes = expenseTypeRepository.getAllExpenseType();
       
       if(expenseTypes==null) throw new IllegalArgumentException();
       
       return expenseTypes;
        
        
    }
    
    public List<DebitCard> getDebitCard() throws IllegalArgumentException{
        
        List<DebitCard> debitCards;
        
        DebitCardRepository debitRepository = new DebitCardRepository();
        
        //Lista completa dos cartões de debito
        debitCards = debitRepository.getAllDebitCard();
        
        if(debitCards==null) throw new IllegalArgumentException();
        
        return debitCards;
    }
    
}
