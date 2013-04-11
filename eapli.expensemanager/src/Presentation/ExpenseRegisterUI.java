/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.ExpenseType;
import Controllers.ExpensesController;
import Model.PaymentMean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
        
        //int opExpenseType = in.nextInt();
        int countExpenseType=0;
        
        ExpensesController controller = new ExpensesController();
        ArrayList<ExpenseType> listExpenseType = new ArrayList<ExpenseType>(controller.getExpenseType());
        ArrayList<PaymentMean> listPaymentMean = new ArrayList<PaymentMean>(controller.getPaymentMean());
        
        System.out.println("List Expense Type:");
        
        for (Iterator<ExpenseType> it = listExpenseType.iterator(); it.hasNext();) {
            ExpenseType expenseType = it.next();
            System.out.print("ID:" + it + " | " + expenseType.getType()); 
        }
        
        System.out.println("Select Expense Type (ID-Number):");
        ExpenseType expenseTypeObj = listExpenseType.get(in.nextInt());
        
        System.out.println("List Payment Means:");
        
        for (PaymentMean obj : listPaymentMean) {
            System.out.println("ID:" + listPaymentMean.indexOf(obj) + " | " + obj.getMean());
        }
        
        System.out.println("Select Payment Means (ID-Number):");
        PaymentMean paymentMeanObj = listPaymentMean.get(in.nextInt());
        
        System.out.println("expense recorded.");
  
    }
}
