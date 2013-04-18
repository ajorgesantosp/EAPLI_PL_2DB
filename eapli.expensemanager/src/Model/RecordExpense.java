/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class RecordExpense {
    
    ExpenseRepository expr;
    List<Expense> lista;
    
    public RecordExpense(){
        expr= new ExpenseRepository();
        lista= new ArrayList<Expense>();
    }
    
    public void loadRepository(){
        lista=expr.getList();
        
    }
    
    public void register(Expense exp){
        lista.add(exp);
        expr.save(exp);
        
    }
    
   
    public List<Expense> getListExpenditures() {
                
        if(lista!=null)
        return lista;
        else
            return null;
    
    
    }
    
    
     public List<Expense> getWeeklyExpenses(){

         // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        Date monday = c.getTime();

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        Date sunday = c.getTime();

        List<Expense> weekly = new ArrayList<Expense>();


        for (int i = 0; i < lista.size(); i++) {

            c.set(lista.get(i).getDate().getYear() + 1900 + 1900, lista.get(i).getDate().getMonth(), lista.get(i).getDate().getDate());

            Date current = c.getTime();
            if (current.compareTo(monday) >= 0 && current.compareTo(sunday) <= 0) {
                weekly.add(lista.get(i));
            }

        }
        return weekly;
        
        
        
    }
    
     
      public List<Expense> getLastMonthExpense() {

        List<Expense> monthExpense = new ArrayList<Expense>();

        Date d = new Date();
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getDate().getMonth() == d.getMonth()) {
                monthExpense.add(lista.get(i));

            }

        }


        return monthExpense;

    }
}
