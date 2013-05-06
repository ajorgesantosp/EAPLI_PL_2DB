/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Interfaces;
import Model.*;

/**
 * Interface de registo de despesas
 *
 * @autor 1110186 & 1110590
 */
public interface IExpenseRepository {
    void save(Expense exp);        
}
