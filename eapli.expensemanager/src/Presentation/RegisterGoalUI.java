/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import Controllers.GoalsController;
import eapli.util.Console;

/**
 *
 * @author i111114
 */
public class RegisterGoalUI {
        public void mainLoop() {
        System.out.println("* * *  REGISTER AN GOAL  * * *\n");
        String descrition = Console.readLine("Description:");
        float cost = Console.readInteger("Custo:");
        GoalsController controller = new GoalsController();
        controller.registerGoal(descrition,false,0,cost);
        System.out.println("Goal recorded.");
    }
}
