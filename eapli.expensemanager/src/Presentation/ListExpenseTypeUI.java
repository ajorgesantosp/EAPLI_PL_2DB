/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import Persistence.ExpenseTypeRepository;


/**
 *
 * @author Emanuel
 */
public class ListExpenseTypeUI{
    
    public void mainLoop() {
        System.out.println("* * *  LIST EXPENSE TYPES  * * *\n");
        
        
        ExpenseTypeController controller = new ExpenseTypeController();
        ExpenseTypeRepository a;
        a=controller.listExpense();
        
        System.out.println(a.getAllExpenseType());
        
        System.out.println("Expense types have been listed!");
    }
    
    
}
