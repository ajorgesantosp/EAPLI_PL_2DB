/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Emanuel
 */
public class RegisterExpenseTypeUI {
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        
        String what = Console.readLine("Tipo:");
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpenseType(what);
        
        System.out.println("expense type recorded.");
    }
    
    
    
}
