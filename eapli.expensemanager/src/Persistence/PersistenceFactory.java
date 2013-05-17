/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author renato
 */
public class PersistenceFactory {
    //private static PersistenceFactory instance = new PersistenceFactory();
    //public EntityManager manager;
    private PersistenceFactory()
	{
         //EntityManagerFactory factory = Persistence.createEntityManagerFactory("eapli.expensemanagerPU");
         //manager = factory.createEntityManager();
	//System.out.println("PersistenceFactory(): Initializing Instance");
	}
    /*
    public static PersistenceFactory getInstance()
	{    
		//return instance;
	}
    */

}
