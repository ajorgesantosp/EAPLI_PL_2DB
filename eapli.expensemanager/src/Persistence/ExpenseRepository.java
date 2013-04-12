/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author losa
 */
public class ExpenseRepository implements IExpenseRepository {
    // class member

    private static List<Expense> listExpense = new ArrayList<Expense>();

    public ExpenseRepository() {
    }

    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);

    }

    /**
     * return the last Expense
     */
    public Expense findLast() {

        if (listExpense.isEmpty()) {
            System.out.println(" No Expense recorded!");
            return null;
        } else {
            Expense exp = listExpense.get(listExpense.size() - 1);
            return exp;
        }
    }

    public List<Expense> getLastMonthExpense() {

        List<Expense> monthExpense = new ArrayList<Expense>();

        Date d = new Date();
        for (int i = 0; i < listExpense.size(); i++) {

            if (listExpense.get(i).getDate().getMonth() == d.getMonth()) {
                monthExpense.add(listExpense.get(i));

            }

        }


        return monthExpense;

    }

    public List<Expense> getList() {
        List<Expense> aExp = listExpense;
        return aExp;
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





        for (int i = 0; i < listExpense.size(); i++) {

            c.set(listExpense.get(i).getDate().getYear() + 1900 + 1900, listExpense.get(i).getDate().getMonth(), listExpense.get(i).getDate().getDate());

            Date current = c.getTime();
            if (current.compareTo(monday) >= 0 && current.compareTo(sunday) <= 0) {
                weekly.add(listExpense.get(i));
            }

        }
        return weekly;

    }
}
