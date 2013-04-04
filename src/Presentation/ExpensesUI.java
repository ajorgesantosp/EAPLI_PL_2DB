/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesController;
import Model.Expense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class ExpensesUI {
    
    
    public void ShowLastExpense(){
        
        ExpensesController ea = new ExpensesController();
        
        System.out.println("Ultima despesa: "+ ea.getLastExpense());
    }
    
    public void ShowListExp(){
        
        List<Expense> listExp = new ArrayList<Expense>();
        ExpensesController ea = new ExpensesController();
        listExp=ea.getWeekExpenses();
        
        /*Falta mostrar as espesas apartir da lista */
        
    }
    
}
