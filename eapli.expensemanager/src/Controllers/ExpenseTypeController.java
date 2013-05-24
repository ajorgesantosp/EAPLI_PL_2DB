/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.inMemory.ExpenseTypeRepositoryImp;

/**
 *
 * @author Emanuel
 */

//Criar novo tipo de despesa ex: automovel, vestuario ... cria e adiciona à lista de tipos.

public class ExpenseTypeController {
    
    public void registerExpenseType(String discription, String type) {
        ExpenseType expType = new ExpenseType(discription, type);
        ExpenseTypeRepositoryImp repo = new ExpenseTypeRepositoryImp();
        repo.save(expType);
    }
    

    
}
