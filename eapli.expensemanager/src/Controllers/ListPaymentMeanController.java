/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Persistence.PaymentMeanRepository;
import java.util.List;

/**
 *
 * @author i110512
 * @author i111114
 */
public class ListPaymentMeanController {
       public List<PaymentMean> listPaymentMean(){
        return new PaymentMeanRepository().getAllPaymentMean();
       
    }
}
