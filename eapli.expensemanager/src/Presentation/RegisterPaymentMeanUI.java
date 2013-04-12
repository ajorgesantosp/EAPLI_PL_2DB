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
        
        String what = Console.readLine("Payment mean:");
        
        PaymentMeanController controller = new PaymentMeanController();
        controller.registerPaymentMean(what);
        
        System.out.println("payment mean recorded.");
    }
}
