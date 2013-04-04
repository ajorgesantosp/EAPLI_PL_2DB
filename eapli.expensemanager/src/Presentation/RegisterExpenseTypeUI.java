/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;

import eapli.util.Console;
/**
 *
 * @author Emanuel
 */
public class RegisterExpenseTypeUI {
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        
        String what = Console.readLine("Tipo:");
        
        ExpenseTypeController controller = new ExpenseTypeController();
        controller.registerExpenseType(what);
        
        System.out.println("expense type recorded.");
    }
    
    
    
}
