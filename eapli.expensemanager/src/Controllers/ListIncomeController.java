/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Income;
import Model.RecordIncome;
import java.util.List;

/**
 *
 * @author Renato
 */
public class ListIncomeController extends BaseController {
    RecordIncome inc;
    
    public ListIncomeController(){
        inc=new RecordIncome();
    }
    
    
    
    public List<Income> getWeeklyIncome(){
        return inc.getWeeklyIncome();
    }
    
    public List<Income> getLastMonthIncome(){
        return inc.getLastMonthIncome();
    }
    
    public List<Income> getListIncome(){
        return inc.getListIncome();
    }
    public List<Income> getIncomeBetweenDates(String begin, String end) throws Exception{
        return inc.getExpenseBetweenDates(begin, end);
    }

    public List<Income> getExpensesBetweenDates(String begin, String end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
