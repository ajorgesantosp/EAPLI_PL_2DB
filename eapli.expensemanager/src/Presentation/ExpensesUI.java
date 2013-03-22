/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.Expense;
import Controllers.ExpensesController;
import java.math.BigDecimal;
/**
 *
 * @author i101068
 */
public class ExpensesUI {
    
        Expense exp;
        BigDecimal amount;
        String description;
        
    public ExpensesUI(){
        ExpensesController ec = new ExpensesController();
        exp = ec.getLastExpense();
        amount = exp.getAmount();
        description = exp.getDescription();        
        System.out.println(" Expense :"+description+" "+amount);
    }
       
}
