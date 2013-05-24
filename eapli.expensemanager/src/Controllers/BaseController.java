/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Income;
import Model.RecordExpense;
import Model.RecordIncome;
import java.util.List;

/**
 *
 * @author Filipe
 */
public abstract class BaseController {

    
    private List<Expense> getLastMonthExpenses() {

        /*
        ExpenseRepository repo = new ExpenseRepository();

        return repo.getLastMonthExpense();*/
        
        RecordExpense re=new RecordExpense();
        
        return re.getLastMonthExpense();


    }

    private List<Expense> getWeeklyExpenses() {

        //ExpenseRepository exprep = new ExpenseRepository();
        RecordExpense re=new RecordExpense();
        return re.getWeeklyExpenses();
        


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
    
    private List<Income> getLastMonthIncome() {

        /*
        ExpenseRepository repo = new ExpenseRepository();

        return repo.getLastMonthExpense();*/
        
        RecordIncome ie=new RecordIncome();
        
        return ie.getLastMonthIncome();


    }

    private List<Income> getWeeklyIncome() {

        //ExpenseRepository exprep = new ExpenseRepository();
        RecordIncome ie=new RecordIncome();
        return ie.getWeeklyIncome();
        


    }

    public void showWeeklyIncomes() {
        System.out.println("* * *  SHOW WEEKLY Incomes  * * *\n");



        List<Income> l = getWeeklyIncome();
        System.out.println("* * *  Show Current Week Income  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).IncomeToString();
                    

        }/*
         System.out.println("Press Enter to continue.");
         Scanner sc = new Scanner(System.in);
         sc.nextLine();*/
    }

    public void ShowlastMonthIncomeLoop() {


        List<Income> l = getLastMonthIncome();

        System.out.println("* * *  Show Last Month Income  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).IncomeToString();

        }/*
         System.out.println("Press Enter to continue.");
         Scanner sc = new Scanner(System.in);
         sc.nextLine();

         */
    }
}


