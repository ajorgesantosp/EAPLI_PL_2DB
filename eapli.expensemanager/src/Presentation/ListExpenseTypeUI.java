/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;


/**
 *
 * @author Emanuel
 */
public class ListExpenseTypeUI{
    
    public void mainLoop() {
        System.out.println("* * *  LIST EXPENSE TYPES  * * *\n");
        
        
        ExpenseTypeController controller = new ExpenseTypeController();
        controller.listExpense(); 
        
        System.out.println("the end!");
    }
    
    
}
