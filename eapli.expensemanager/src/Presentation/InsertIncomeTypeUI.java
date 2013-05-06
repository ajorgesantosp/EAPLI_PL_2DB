/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.util.Scanner;
import Controllers.InsertIncomeTypeController;

/**
 *
 * @autor 1110186 & 1110590
 */
public class InsertIncomeTypeUI {
    
    private static Scanner in = new Scanner(System.in);
    
    public void mainLoop() {
        try {
            System.out.println("* * *  REGISTER Income Type  * * *\n");

            System.out.print("Income Type:");
            String incType = in.nextLine();
            System.out.print("Description:");
            String what = in.nextLine();
            
            InsertIncomeTypeController controller = new InsertIncomeTypeController();

            controller.registerIncomeType(incType,what);

            System.out.println("income type recorded.");
        } catch (IllegalArgumentException ex) {
            System.err.println("Illegal Argument!");
        } catch (Exception ex) {
            System.err.println("WARNING: OTHER ERROR! CONTACT ADMIN!");
        }

    }
    
}
