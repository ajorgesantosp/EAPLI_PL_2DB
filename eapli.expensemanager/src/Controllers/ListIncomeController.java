/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.RecordIncome;
import java.util.List;

/**
 *
 * @author Renato
 */
public class ListIncomeController {
    RecordIncome inc;
    
    public ListIncomeController(){
        inc=new RecordIncome();
    }
    
    public List<Income> getExpensesBetweenDates(String begin, String end) throws Exception{
        return inc.getExpenseBetweenDates(begin, end);
    }
}
