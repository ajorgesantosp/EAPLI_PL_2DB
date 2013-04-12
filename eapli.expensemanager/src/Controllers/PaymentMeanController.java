/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Persistence.PaymentMeanRepository;

/**
 *
 * @author i110512 
 * @author i111114 
 */
public class PaymentMeanController {
     public void registerPaymentMean(String mean) {
        PaymentMean payMean = new PaymentMean(mean);
        PaymentMeanRepository repo = new PaymentMeanRepository();
        repo.save(payMean);
    }
    
    public void listPaymentMean(){
        
       PaymentMeanRepository repo = new PaymentMeanRepository();
       System.out.println(repo.getAllPaymentMean());
       
    }
}
