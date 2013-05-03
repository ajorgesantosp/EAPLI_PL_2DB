/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


/**
 *
 * @author 1110512
 */

@PersistenceUnit
public class PersistanceInitPaymentMean {
    public static EntityManager init()
        {
             EntityManagerFactory factory = Persistence.createEntityManagerFactory("PaymentMean");
             EntityManager manager = factory.createEntityManager();
             return manager;
    }
}
