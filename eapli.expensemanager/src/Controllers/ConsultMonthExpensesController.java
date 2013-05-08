
package Controllers;

/**
 * *
 * @autor 1110186 & 1110590
 *
 */

import Model.Expense;
import Model.RecordExpense;
import java.util.ArrayList;
import java.util.List;

public class ConsultMonthExpensesController {
    
    public List<Expense> getMonthExpenses(int MonthNumber,int YearNumber){
        RecordExpense expRepo=new RecordExpense();
        
        List<Expense> expenses=expRepo.getListExpenditures();
        List<Expense> aux;
        aux = new ArrayList<Expense>();

        for(int i=0;i<expenses.size();i++){
            if((expenses.get(i).getDate().getMonth()==MonthNumber) && (expenses.get(i).getDate().getYear()==YearNumber)){
                aux.add(expenses.get(i));
            }
        }
        return aux; 
    }
    
    
}

