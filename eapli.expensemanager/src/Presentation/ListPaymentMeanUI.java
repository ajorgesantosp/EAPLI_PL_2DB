/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentMeanController;
import Model.PaymentMean;
import java.util.List;

/**
 *
 * @author i110512
 * @author i111114
 */
public class ListPaymentMeanUI {
     public void mainLoop() {
        System.out.println("* * *  LIST PAYMENT MEANS  * * *\n");
        
        
        PaymentMeanController controller = new PaymentMeanController();
        for(PaymentMean m : controller.listPaymentMean())
        {
            System.out.println(m.toString());
        }
        System.out.println("the end!");
    }
}
