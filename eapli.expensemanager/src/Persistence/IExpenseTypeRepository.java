/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;

/**
 *
 * @author Emanuel
 */
public interface IExpenseTypeRepository {
    void save(ExpenseType expType);
}