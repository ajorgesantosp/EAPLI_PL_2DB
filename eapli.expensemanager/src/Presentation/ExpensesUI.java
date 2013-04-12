/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Model.Expense;
import Controllers.ExpensesController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author i101068
 */
public class ExpensesUI extends BaseUI {

    Expense exp;
    BigDecimal amount;
    String description;

    ExpensesController ec;
    public ExpensesUI() {
        ec=new ExpensesController();
    }

    public void doShow() {

        int option = 0;

        do {
            
            this.showBalance();

            System.out.println("===================");
            System.out.println("  LIST EXPENSES  ");
            System.out.println("===================\n");

            System.out.println("1. Last Month Expenses");
            System.out.println("2. All Expenses");
            System.out.println("3. Current Week Expenses");
            System.out.println("0. Exit\n\n");
            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:

                    return;
                case 1:
                    lastMonthExpensesLoop();
                    break;
                case 2:
                    ListExpenditures();
                    break;
                case 3:
                    getWeeklyExpenses();
                    break;
            }
        } while (option != 0);


    }

    public void lastMonthExpensesLoop() {


        
        List<Expense> l = ec.getLastMonthExpenses();

        System.out.println("* * *  Show Last Month Expense  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).expenseToString();

        }
        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();


    }

    public void ListExpenditures() {
        System.out.println("* * *  SHOW LIST EXPENDITURES  * * *\n");

        

        List<Expense> aExp = ec.getListExpenditures();

        for (int i = 0; i < aExp.size(); i++) {

            System.out.println("<--- " + (i + 1) + "º Expense --->");
            System.out.println("Amount : " + aExp.get(i).getAmount().doubleValue() + "");
            System.out.println("Description : " + aExp.get(i).getDescription() + "");
            System.out.println("Date : " + aExp.get(i).getDate()+ "\n");
        }

        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
    
    public void getWeeklyExpenses(){
        System.out.println("* * *  SHOW WEEKLY EXPENDITURES  * * *\n");

        

        List<Expense> l = ec.getWeeklyExpenses();
        System.out.println("* * *  Show Current Week Expensea  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).expenseToString();

        }
        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    @Override
    protected BaseController getController() {
        return ec;
    }
    
}
