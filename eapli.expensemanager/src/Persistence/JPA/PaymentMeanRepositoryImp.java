/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PaymentMean;
import Persistence.Interfaces.PaymentMeanRepository;

/**
 *
 * @author renato
 */
public class PaymentMeanRepositoryImp implements PaymentMeanRepository{
    
   
   
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
    

