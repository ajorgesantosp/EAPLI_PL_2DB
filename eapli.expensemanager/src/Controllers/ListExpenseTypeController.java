/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.ExpenseTypeRepository;
import Model.ExpenseType;

/**
 *
 * @author Emanuel
 */
public class ListExpenseTypeController {
        public ExpenseTypeRepository listExpense(){
        
       ExpenseTypeRepository repo = new ExpenseTypeRepository(); 
       return repo;
    }
}
