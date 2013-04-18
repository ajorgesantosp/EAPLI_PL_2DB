/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.RecordExpense;
import java.util.List;

/**
 *
 * @author renato
 */
public class ListExpensesController extends BaseController{
    RecordExpense rec;
    public ListExpensesController(){
        rec=new RecordExpense();
    }
    
    public List<Expense> getWeeklyExpenses(){
        return rec.getWeeklyExpenses();
    }
    
    public List<Expense> getListExpenditures(){
        
      
        return rec.getListExpenditures();
    }
    
    public List<Expense> getLastMonthExpenses(){
        return rec.getLastMonthExpense();
    }
}
