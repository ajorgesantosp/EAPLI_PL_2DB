/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.PaymentMeanController;
import eapli.util.Console;

/**
 *
 * @author i110512
 * @author i111114
 */
public class RegisterPaymentMeanUI {
        public void mainLoop() {
        System.out.println("* * *  REGISTER AN PAYMENT MEAN  * * *\n");
        
        String payMean = Console.readLine("Payment mean:");
        String desc = Console.readLine("Description:");
        
        PaymentMeanController controller = new PaymentMeanController();
        controller.registerPaymentMean(desc, payMean);
        
        System.out.println("Insert a valid Payment mean"); 
        
        
        
    }
}
