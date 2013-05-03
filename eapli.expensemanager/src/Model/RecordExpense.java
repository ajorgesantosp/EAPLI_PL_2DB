/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.inMemory.ExpenseRepository;
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
    private static List<Expense> lista = new ArrayList<Expense>();;

    public RecordExpense() {
        expr = new ExpenseRepository();
        //lista = new ArrayList<Expense>();
    }

    public void loadRepository() {
        lista = expr.getList();

    }

    public void register(Expense exp) {
        //lista.add(exp);
        expr.save(exp);

    }

    public List<Expense> getListExpenditures() {

        if (lista != null) {
            return lista;
        } else {
            return null;
        }


    }

    public List<Expense> getWeeklyExpenses() {

        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        Date monday = c.getTime();

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        Date sunday = c.getTime();

        List<Expense> weekly = new ArrayList<Expense>();


        for (int i = 0; i < lista.size(); i++) {

            int ano=lista.get(i).getDate().getYear();
            if(ano<0)
                ano=ano+1900+1900;
                
            c.set(ano, lista.get(i).getDate().getMonth()-1, lista.get(i).getDate().getDate());

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

    public Expense findLast() {

        if (lista.isEmpty()) {
            System.out.println(" No Expense recorded!");
            return null;
        } else {
            Expense exp = lista.get(lista.size() - 1);
            return exp;
        }
    }
}
