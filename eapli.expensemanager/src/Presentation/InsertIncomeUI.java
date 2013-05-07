package Presentation;

import Controllers.InsertIncomeController;
import java.util.Scanner;
import Model.IncomeType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @autor 1110186 & 1110590
 */
public class InsertIncomeUI {
    
    private static Scanner in = new Scanner(System.in);
    
    public void mainLoop() {
        try {
            System.out.println("* * *  REGISTER Income * * *\n");

            System.out.print("Amount:");
            BigDecimal amount = in.nextBigDecimal();
            System.out.println("Date:");
            System.out.print("    Year:");
            int year = in.nextInt();
            System.out.println("    Mounth:");
            int month = in.nextInt();
            System.out.println("    Day:");
            int day = in.nextInt();
            Date date = new Date(year, month, day);
            System.out.print("Description:");
            String what = in.nextLine();
            
            InsertIncomeController controller = new InsertIncomeController();
            
            ArrayList<IncomeType> incomeType = new ArrayList<IncomeType>(controller.getAllIncomeType());
            
            System.out.println("List Income Type:");

            for (IncomeType obj : incomeType) {
                System.out.println("ID:" + incomeType.indexOf(obj) + " | " + obj.getType());
            }
            
            IncomeType incType = incomeType.get(in.nextInt());
            
            controller.registerIncome(amount, date, what, incType);

            System.out.println("income recorded.");
        } catch (IllegalArgumentException ex) {
            System.err.println("Illegal Argument!");
        } catch (Exception ex) {
            System.err.println("WARNING: OTHER ERROR! CONTACT ADMIN!");
        }

    }
    
}