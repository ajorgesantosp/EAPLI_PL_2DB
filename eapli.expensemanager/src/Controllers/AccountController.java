/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Account;
import Model.Expense;
import Model.Expense;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public class AccountController {
    
    
      public BigDecimal showBalance(){
        Account acc = new Account();
        List<Expense> expenses=expRepo.getListExpenditures();
        List<Expense> aux;
        aux = new ArrayList<Expense>();

        for(int i=0;i<expenses.size();i++){
            if((expenses.get(i).getDate().getMonth()==MonthNumber) && (expenses.get(i).getDate().getYear()==YearNumber)){
                aux.add(expenses.get(i));
            }
        }
        return aux; 
    }
}
