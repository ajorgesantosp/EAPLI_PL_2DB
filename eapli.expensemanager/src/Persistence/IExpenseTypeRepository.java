/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface IExpenseTypeRepository {
    void save(ExpenseType expType);
    ExpenseType FindExpenseTypes(String nome);
    List<ExpenseType> getAllExpenseType();
}