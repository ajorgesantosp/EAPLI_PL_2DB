/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ListExpenseTypeController;
import Persistence.inMemory.ExpenseTypeRepositoryImp;


/**
 *
 * @author Emanuel
 */
public class ListExpenseTypeUI{
    
    public void mainLoop() {
        System.out.println("* * *  LIST EXPENSE TYPES  * * *\n");
        
        
        ListExpenseTypeController controller = new ListExpenseTypeController();
        ExpenseTypeRepositoryImp a;
        a=controller.listExpense();
        
        System.out.println(a.getAllExpenseType());
        
        System.out.println("Expense types have been listed!");
    }
    
    
}
