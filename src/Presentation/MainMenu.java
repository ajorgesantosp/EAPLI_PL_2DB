/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {
    public void mainLoop() {
        System.out.println("===================");
        System.out.println("  EXPENSE MANAGER  ");
        System.out.println("===================\n");
        
      
        System.out.println("2. Show last expense");
        System.out.println("3. Show expenses of the week");
        System.out.println("0. Exit\n\n");
        
        
        
        int option = Console.readInteger("Please choose a option");
        switch (option) {
            case 0: 
                System.out.println("bye bye ...");
                return;
            case 1: 
                ExpenseRegisterUI ui = new ExpenseRegisterUI();
                ui.mainLoop();
                break;
            case 2:
                ExpensesUI eui = new ExpensesUI();
                break;
            case 3:
                ExpensesUI temp = new ExpensesUI();
                break;
        }
    }
}
