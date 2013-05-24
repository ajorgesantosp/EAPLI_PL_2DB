/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ListIncomeController;
import Model.Income;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class IncomeUI extends BaseUI {

    Income exp;
    BigDecimal amount;
    String description;

    ListIncomeController ic;
    
  
    public IncomeUI() {
        ic=new ListIncomeController();
    }

    public void doShow() {

        int option = 0;

        do {
            
            this.showBalance();

            System.out.println("===================");
            System.out.println("  LIST INCOME  ");
            System.out.println("===================\n");

            System.out.println("1. Last Month Income");
            System.out.println("2. All Income");
            System.out.println("3. Current Week Income");
            System.out.println("0. Exit\n\n");
            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:

                    return;
                case 1:
                    lastMonthIncomeLoop();
                    break;
                case 2:
                    ListIncomes();
                    break;
                case 3:
                    getWeeklyExpenses();
                    break;
            }
        } while (option != 0);


    }

    public void lastMonthIncomeLoop() {


        
        List<Income> l = ic.getLastMonthIncome();

        System.out.println("* * *  Show Last Month Expense  * * *\n");

        for (int i = 0; i < l.size(); i++) {
            l.get(i).IncomeToString();

        }
        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();


    }

      
    
    public void getWeeklyExpenses(){
        System.out.println("* * *  SHOW CURRENT WEEK EXPENDITURES  * * *\n");

        

        List<Income> l = ic.getWeeklyIncome();
        
        for (int i = 0; i < l.size(); i++) {
            l.get(i).incomeToString();

        }
        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void ListIncomes() {
        System.out.println("* * *  SHOW LIST EXPENDITURES  * * *\n");

        

        List<Income> aExp = ic.getListIncome();

        for (int i = 0; i < aExp.size(); i++) {

            System.out.println("<--- " + (i + 1) + "º Income --->");
            aExp.get(i).IncomeToString();
            
        }

        System.out.println("Press Enter to continue.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
    
    @Override
    protected BaseController getController() {
        return ic;
    }

}

