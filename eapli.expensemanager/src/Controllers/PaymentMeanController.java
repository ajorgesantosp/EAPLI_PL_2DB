/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentMean;
import Persistence.inMemory.PaymentMeanRepositoryImp;
import java.util.List;

/**
 *
 * @author i110512
 * @author i111114
 */
// Register PaymentMean
public class PaymentMeanController {

    public void registerPaymentMean(String description, String mean) {
        if (mean.equals("")) {
            throw new IllegalArgumentException();
        } else {
            PaymentMean payMean = new PaymentMean(description, mean);
            PaymentMeanRepositoryImp repo = new PaymentMeanRepositoryImp();
            repo.save(payMean);
        }
    }
}
