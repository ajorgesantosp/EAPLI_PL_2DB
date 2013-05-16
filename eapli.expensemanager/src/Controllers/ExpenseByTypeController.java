/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseTA;
import Model.RecordExpense;
import java.util.List;

/**
 *
 * @author i100905 & 1070413
 */
public class ExpenseByTypeController {
    
    
    public List<ExpenseTA> getSpecificMonth(int year, int month){
    
        RecordExpense re=new RecordExpense();
        return re.monthTypeAmount(year, month);
    
    }
}
