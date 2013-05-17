/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PaymentMean;
import Persistence.Interfaces.IPaymentMeanRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author renato
 */
public class PaymentMeanRepositoryJPA implements IPaymentMeanRepository{
    
   
   
    @Override
    public PaymentMean find(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(PaymentMean payMean) {
        /*
        PersistenceFactory per=PersistenceFactory.getInstance();
             
             per.manager.getTransaction().begin();    
             per.manager.merge(payMean);
             per.manager.getTransaction().commit();*/
    }
    
}
    

