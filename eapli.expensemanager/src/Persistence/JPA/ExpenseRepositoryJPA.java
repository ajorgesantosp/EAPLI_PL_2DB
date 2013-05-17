/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import Persistence.Interfaces.IExpenseRepository;
import Persistence.PersistenceFactory;

/**
 * Classe Repositorio em memoria de despesas
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseRepositoryJPA implements IExpenseRepository{
    
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
