/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.ExpenseDebitCardController;
import Model.DebitCard;
import Model.ExpenseType;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {

    private static Scanner in = new Scanner(System.in);

    public void mainLoop() {

        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");

        System.out.print("Description:");
        String what = in.nextLine();
        System.out.print("When:");
        System.out.println("   ->Day:");
        int day, month, year;
        day = in.nextInt();
        System.out.println("   ->Month:");
        month = in.nextInt();
        System.out.println("   ->Year:");
        year = in.nextInt();
        Date date = new Date(year,month,day);
        System.out.print("Amount:");
        double value = in.nextDouble();
        BigDecimal amount = new BigDecimal(value);
        
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(what, date, amount, "money");
        
        System.out.println("expense recorded.");


    }

    //Metodo em desenvolvimento
    /*
    public void expenseDebitCardPayment(String what, Date date, BigDecimal amount) {

        int opExpenseType = in.nextInt();
        int countExpenseType=0;
        
        ExpenseDebitCardController controller = new ExpenseDebitCardController();
        List<ExpenseType> listExpenseType = controller.getExpenseType();
        ArrayList<DebitCard> listDebitCard = controller.getDebitCard();
        
        System.out.println("List Expense Type:");
        
        for (Iterator<ExpenseType> it = listExpenseType.iterator(); it.hasNext();) {
            ExpenseType expenseType = it.next();
            System.out.print("ID:" + it + " | " + expenseType.getType()); 
        }
        
        System.out.println("Select Expense Type (ID-Number):");
        ExpenseType expenseTypeObj = listExpenseType.get(in.nextInt());
        
        System.out.println("List Debit Card");
        
        for (DebitCard obj : listDebitCard) {
            System.out.println("ID:" + listDebitCard.indexOf(obj) + " | " + obj.getNumDC() + " | " + obj.getNameDC());
        }
        
        System.out.println("Select Debit Cart (ID-Number):");
        DebitCard debitCardObj = listDebitCard.get(in.nextInt());
        
        ExpenseRegisterController controller2 = new ExpenseRegisterController();
        controller2.registerExpense(;
        
    }*/

}
