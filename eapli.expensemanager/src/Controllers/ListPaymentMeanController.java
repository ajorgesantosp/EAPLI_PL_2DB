/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Persistence.inMemory.PaymentMeanRepositoryImp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110512
 * @author i111114
 */
public class ListPaymentMeanController {
       public List<PaymentMean> listPaymentMean(){
           List<PaymentMean> tmp = (new PaymentMeanRepositoryImp()).getAllPaymentMean();
           if(tmp.isEmpty())
               throw new NullPointerException();
            return tmp;  
    }
}
