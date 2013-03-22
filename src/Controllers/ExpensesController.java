/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class ExpensesController {
    
    public ExpensesController(){
        
        
    }
    
    public List<Expense> getWeekExpenses(){
        
        List<Expense> list= new ArrayList<Expense>();
        
        ExpenseRepository temp = new ExpenseRepository();
        
        
        
        return list;
        
    }
    
    public Expense getLastExpense(){
        
        ExpenseRepository e = new ExpenseRepository();
        
        return e.FindLast();
        
    }
}
