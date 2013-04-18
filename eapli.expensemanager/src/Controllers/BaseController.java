/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public abstract class BaseController {

    private List<Expense> getLastMonthExpenses() {

        ExpenseRepository repo = new ExpenseRepository();

        return repo.getLastMonthExpense();


    }

    private List<Expense> getWeeklyExpenses() {

        ExpenseRepository exprep = new ExpenseRepository();
        List<Expense> aExp = exprep.getWeeklyExpenses();
        return aExp;


    }

    public void showWeeklyExpenses() {
        System.out.println("* * *  SHOW WEEKLY EXPENDITURES  * * *\n");



        List<Expense> l = getWeeklyExpenses();
        System.out.println("* * *  Show Current Week Expensea  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).expenseToString();
                    

        }/*
         System.out.println("Press Enter to continue.");
         Scanner sc = new Scanner(System.in);
         sc.nextLine();*/
    }

    public void ShowlastMonthExpensesLoop() {


        List<Expense> l = getLastMonthExpenses();

        System.out.println("* * *  Show Last Month Expense  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).expenseToString();

        }/*
         System.out.println("Press Enter to continue.");
         Scanner sc = new Scanner(System.in);
         sc.nextLine();

         */
    }
}
