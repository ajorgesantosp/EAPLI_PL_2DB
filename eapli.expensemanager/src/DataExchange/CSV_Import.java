/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExchange;

import Controllers.InsertIncomeController;
import Controllers.RegisterExpenseController;
import Model.ExpenseType;
import Model.IncomeType;
import Model.PaymentMean;
import eapli.util.DateTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public  class CSV_Import {

    public static void ImportCSV(String file) throws ParseException {

        String linha;
        boolean flag = false; 
        RegisterExpenseController controller = new RegisterExpenseController();
        InsertIncomeController  inc_controller = new InsertIncomeController();

        try {
            Scanner inputStream = new Scanner(new File(file+".csv"));

            linha = inputStream.nextLine();//Pega na linha inteira  
            String values[] = linha.split("\\;");

            

                linha = inputStream.nextLine();
               values = linha.split("\\;");

                while (!values[0].equals("")) {
                    
                    //criar a despesa
                    //StrW.write("Expense;Description;Amount;Type;Mean;Date\n");

                    String description = values[1];
                    String salePrice = values[2];
                    String price = salePrice.replace("â‚¬", "");
                    BigDecimal sPrice = new BigDecimal(price); 
                    Date date = (java.util.Date)DateTime.parseDate(values[5]);
                    PaymentMean p = new PaymentMean(values[1], values[3]);

                    ExpenseType e = new ExpenseType(values[1], values[3]);

                    controller.createExpense(values[1], date, sPrice, e, p);

                 linha = inputStream.nextLine();
                 values = linha.split("\\;");
                }


            linha = inputStream.nextLine();
            values = linha.split("\\;");

            if (values[0].equals("Income")) {

                while (inputStream.hasNext()) {

                    linha = inputStream.nextLine();
                    values = linha.split("\\;");

                    //criar a receita
                    //StrW.write("Income;Description;Amount;IncomeType;Date\n");

                    String descricao = values[1];
                    
                    String dats[] = values[4].split("//");
                    int year = Integer.parseInt(dats[2]);
                    int month = Integer.parseInt(dats[1]);
                    int day = Integer.parseInt(dats[0]);
                    Date date = (java.util.Date)DateTime.parseDate(values[5]);

                    String price = values[2].replace("â‚¬", "");
                    BigDecimal sPrice = new BigDecimal(price);

                    IncomeType inc = new IncomeType(descricao, values[3]);
                    
                     inc_controller.registerIncome(sPrice, date, descricao, inc);
                }

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}