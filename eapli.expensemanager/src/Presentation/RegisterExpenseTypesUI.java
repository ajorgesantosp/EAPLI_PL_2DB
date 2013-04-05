/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.ExpenseType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Emanuel
 */
public class RegisterExpenseTypesUI {
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE WITH EXPENSE TYPE  * * *\n");
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        String type = Console.readLine("Type");
        
        ExpenseType expType = new ExpenseType (type);
        
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        //controller.registerExpenseWithType(what, date, amount,expType);
        
        System.out.println("expense with expense type recorded.");
    }
    
    
}
