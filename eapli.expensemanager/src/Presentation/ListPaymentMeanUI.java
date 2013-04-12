/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;

/**
 *
 * @author i110512
 * @author i111114
 */
public class ListPaymentMeanUI {
     public void mainLoop() {
        System.out.println("* * *  LIST PAYMENT MEANS  * * *\n");
        
        
        PaymentMeanController controller = new PaymentMeanController();
        controller.listPaymentMean(); 
        
        System.out.println("the end!");
    }
}
