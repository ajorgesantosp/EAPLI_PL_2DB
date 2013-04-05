/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.List;

/**
 *
 * @author i101068
 */
public class ExpensesController {
    
    public ExpensesController(){ }
    
    
    /**
     * return the last Expense recorded
     * @return 
     */
    public Expense getLastExpense(){
        ExpenseRepository er = new ExpenseRepository();
        return er.findLast();
    } 
    public List<Expense> getLastMonthExpenses(){
        
        ExpenseRepository repo = new ExpenseRepository();
        
       return repo.getLastMonthExpense();
        
        
    }
    public List<Expense> getListExpenditures() {
        ExpenseRepository exprep = new ExpenseRepository();
        List<Expense> aExp = exprep.getList();
      
        return aExp;
    }
}
