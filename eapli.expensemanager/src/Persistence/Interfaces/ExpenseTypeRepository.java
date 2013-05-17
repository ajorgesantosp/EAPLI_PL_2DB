/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Interfaces;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface ExpenseTypeRepository {
    void save(ExpenseType expType);
    ExpenseType FindExpenseTypes(String nome);
    List<ExpenseType> getAllExpenseType();
}