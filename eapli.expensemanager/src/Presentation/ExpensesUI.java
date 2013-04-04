/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.Expense;
import Controllers.ExpensesController;
import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author i101068
 */
public class ExpensesUI {
    
        Expense exp;
        BigDecimal amount;
        String description;
        
    public ExpensesUI(){

    }
    
    public void mainLoop() {


        System.out.println("* * *  Show Last Expense  * * *\n");

        ExpensesController controller = new ExpensesController();
        Expense e = controller.getLastExpense();
        System.out.println("Last expense Description: " + e.getDescription());
        System.out.println("Last expense value: " + e.getAmount());


    }
    
        public void lastMonthExpensesLoop() {


        ExpensesController controller = new ExpensesController();
        List<Expense> l = controller.getLastMonthExpenses();

        System.out.println("* * *  Show Last Month Expense  * * *\n");
        
        for(int i=0;i<l.size();i++){
            l.get(i).expenseToString();
            
        }

    }
       
}
