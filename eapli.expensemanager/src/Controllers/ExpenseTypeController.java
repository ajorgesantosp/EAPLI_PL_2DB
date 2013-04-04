/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;

/**
 *
 * @author Emanuel
 */

//Criar novo tipo de despesa ex: automovel, vestuario ... cria e adiciona à lista de tipos.

public class ExpenseTypeController {
    
    public void registerExpenseType(String type) {
        ExpenseType expType = new ExpenseType(type);
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expType);
    }
    
    
}
