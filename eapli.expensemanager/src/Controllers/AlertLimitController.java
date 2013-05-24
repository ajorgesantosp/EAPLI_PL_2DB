/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseTypeRepository;
import Persistence.inMemory.ExpenseRepository;
import eapli.exception.EmptyList;
import java.math.BigDecimal;

/**
 *
 * @author i110401
 */
public class AlertLimitController {
    
    public /*BigDecimal*/ void calculateDeviation(String me){
        ExpenseTypeRepository expty = new ExpenseTypeRepository();
        ExpenseRepository expt = new ExpenseRepository();
        BigDecimal big;
        if(expty.FindStringExpenseTypes(me)){
           // Expense exp = new Expense(); 
           // big=expt.equals(exp);
               //
               //for(Object o : expt.getList()){
                  
               // }
        }
       // return big;
    }
    
}

