/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.inMemory.ExpenseTypeRepositoryImp;
import Model.ExpenseType;

/**
 *
 * @author Emanuel
 */
public class ListExpenseTypeController {
        public ExpenseTypeRepositoryImp listExpense(){
        
       ExpenseTypeRepositoryImp repo = new ExpenseTypeRepositoryImp(); 
       return repo;
    }
}
