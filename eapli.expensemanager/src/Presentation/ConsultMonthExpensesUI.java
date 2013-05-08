package Presentation;

/**
 * *
 * @autor 1110186 & 1110590
 *
 */

import Controllers.ConsultMonthExpensesController;
import Controllers.RegisterExpenseController;
import Model.Expense;
import Model.ExpenseType;
import eapli.exception.EmptyList;


import java.util.List;
import java.util.Scanner;

public class ConsultMonthExpensesUI {
    private Scanner in=new Scanner(System.in);
    
    public void mainLoop() {
        try {
            System.out.println("* * *  Consult Month Expenses  * * *\n");
            
            int MonthNumber;
            int YearNumber;
            
            
            System.out.println("Month(number):");
            MonthNumber=in.nextInt();
            System.out.println("\nYear:");
            YearNumber=in.nextInt();
            
            ConsultMonthExpensesController consultController=new ConsultMonthExpensesController();
            RegisterExpenseController expTypeController=new RegisterExpenseController();
            List<Expense> exp;
            List<ExpenseType> expType;
            
            exp=consultController.getMonthExpenses(MonthNumber, YearNumber);
            expType=expTypeController.getExpenseType();
            System.out.println("\n* * *  Show Month Expense  * * *\n");
            for(int i=0;i<expType.size();i++){
                for(int j=0;j<exp.size();j++){
                    if(expType.get(i).getType().equalsIgnoreCase(exp.get(j).getType().getType())){
                        System.out.println("Tipo de despesa:"+expType.get(i).getType());
                        exp.get(j).expenseToString();
                    }
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println("Illegal Argument!");
        } catch (EmptyList ex) {
            System.err.println("Expense Type List Empty");
        }
        
        
    
    }
    
    
    
}
