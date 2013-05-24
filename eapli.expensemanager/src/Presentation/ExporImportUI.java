/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ListExpensesController;
import Controllers.ListIncomeController;
import DataExchange.CSV_Export;
import DataExchange.CSV_Import;
import DataExchange.XML_Export;
import DataExchange.XML_Import;
import Model.Expense;
import Model.Income;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato
 */
public class ExporImportUI{
    
    
    private static Scanner in = new Scanner(System.in);
    ListExpensesController ec= new ListExpensesController();
    ListIncomeController inc=new ListIncomeController();
    
    void doShow() {
        int option = 0;
        do {
            
           

            System.out.println("===================");
            System.out.println("  Import/Export  ");
            System.out.println("===================\n");

            System.out.println("1. Export to CSV");
            System.out.println("2. Export to XML");
            System.out.println("3. Import CSV");
            System.out.println("4. Import XML");
            System.out.println("0. Exit\n\n");
            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:

                    return;
                case 1:
            try {
                ExportCSV();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
                    break;
                case 2:
            try {
                ExportXML();
            } catch (Exception ex) {
                 System.out.println(ex.toString());
            }
                    break;
                case 3:
            try {
                ImportCSV();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
                    break;
                case 4:
            try {
                ImportXML();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
                    break;
            }
        } while (option != 0);
    }

   

    private void ExportCSV() throws Exception  {
        System.out.println("Begin Date (dd-mm-yyyy):");
        String begin = in.nextLine();
        System.out.println("End Date (dd-mm-yyyy):");
        String end = in.nextLine();
        List<Expense> listExp=ec.getExpensesBetweenDates(begin, end);
        List<Income> listInc=inc.getExpensesBetweenDates(begin, end);
        CSV_Export.createCsvFile(begin, end, listExp, listInc);
        
        
    }

    private void ExportXML() throws Exception{
        System.out.println("Begin Date (dd-mm-yyyy):");
        String begin = in.nextLine();
        System.out.println("End Date (dd-mm-yyyy):");
        String end = in.nextLine();
        List<Expense> listExp=ec.getExpensesBetweenDates(begin, end);
        List<Income> listInc=inc.getExpensesBetweenDates(begin, end);
        XML_Export.escrita(begin, end, listExp, listInc);
    }

    private void ImportCSV() throws Exception {
         System.out.println("File name:");
        String file = in.nextLine();
        CSV_Import.ImportCSV(file);
    }

    private void ImportXML() throws Exception {
         System.out.println("File name:");
        String file = in.nextLine();
        XML_Import.leitura(file);
    }
    
}
