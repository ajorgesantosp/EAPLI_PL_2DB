/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;

/**
 * Classe Repositorio em memoria de despesas
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseRepository implements Persistence.Interfaces.ExpenseRepository{
    
    @Override
    public void save(Expense exp) {
        /*
        PersistenceFactory per=PersistenceFactory.getInstance();
             
             per.manager.getTransaction().begin();    
             per.manager.merge(exp);
             per.manager.getTransaction().commit();
             */
    }
    
}
