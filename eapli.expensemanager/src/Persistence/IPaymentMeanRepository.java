/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;

/**
 *
 * @author i110512
 */
public interface IPaymentMeanRepository {
    void save(PaymentMean expType);
}
