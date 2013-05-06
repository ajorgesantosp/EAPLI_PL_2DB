/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Interfaces;

import Model.PaymentMean;

/**
 *
 * @author i110512
 * @author i111114
 */
public interface IPaymentMeanRepository {
    void save(PaymentMean payMean);
    PaymentMean find(String name);
    void showAll();
}
