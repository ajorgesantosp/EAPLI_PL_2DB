
package Controllers;

/**
 * *
 * @autor 1110186 & 1110590
 *
 */

import Model.Expense;
import Persistence.inMemory.ExpenseRepository;
import eapli.exception.EmptyList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultMonthExpensesController {
    
    public List<Expense> getMonthExpenses(int MonthNumber,int YearNumber){
        ExpenseRepository expRepo=new ExpenseRepository();
        
        List<Expense> expenses = null;
        List<Expense> aux;
        aux = new ArrayList<Expense>();
        try {
            expenses=expRepo.getList();
        } catch (EmptyList ex) {
            Logger.getLogger(ConsultMonthExpensesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<expenses.size();i++){
            if((expenses.get(i).getDate().getMonth()==MonthNumber) && (expenses.get(i).getDate().getYear()==YearNumber)){
                aux.add(expenses.get(i));
            }
        }
        return aux; 
    }
    
    
}

