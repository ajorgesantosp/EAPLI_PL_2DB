/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExchange;

import Model.Expense;
import Model.Income;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruben
 */
public  class XML_Export {

    public static void escrita(String data1, String data2, List<Expense> despesas, List<Income> receitas, String exp) throws Exception {

        System.out.println("Despesas tamanho"+despesas.size());
        System.out.println("Income tamanho"+receitas.size());
        
        int tamanho_despesas = despesas.size();
        int tamanho_receitas = receitas.size();

        //necessita de duas datas como parametro
        FileWriter f1 = new FileWriter(new File(exp+".xml"));
        f1.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n\n\n");
        f1.write("<Expenses_Income> \n"
                + "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
                + "    xsi:noNamespaceSchemaLocation=\"pessoas.xsd\"\n");
  
//escrita das despesas

        while (tamanho_despesas > 0) {

            f1.write("<Expenses>\n");
            
            Expense e = despesas.get(tamanho_despesas-1);

            f1.write("<Description>");
//escrita da descriÃ§Ã£o
            f1.write(e.getDescription());
            f1.write("</Description>\n");

            f1.write("<Amount>");
//escrita do montante

            f1.write(String.valueOf((e.getAmount()).toString()));
            f1.write("</Amount>\n");

            f1.write("<Date>");
//escrita da data
            f1.write(String.valueOf(e.getDate().getDate()+"-"+(e.getDate().getMonth()+1)+"-"+(e.getDate().getYear()+1900)));
            f1.write("</Date>\n");

            f1.write("<PaymentMean>");
//escrita da meio
            f1.write(String.valueOf(e.getPaymentMeanString().toString()));
            f1.write("</PaymentMean>\n");

            f1.write("<ExpenseType>");
//escrita do tipo
            f1.write(String.valueOf((e.getType()).toString()));
            f1.write("</ExpenseType>\n");

            f1.write("</Expenses>\n");
            
            tamanho_despesas--;

        }   

//agora o income
        
//escrita das receitas

        while (tamanho_receitas > 0) {

            f1.write("<Income>\n");
            
            Income i = receitas.get(tamanho_receitas-1);

            f1.write("<Description>");
//escrita da descriÃ§Ã£o
            f1.write(i.getDescription());
            f1.write("</Description>\n");

            f1.write("<Amount>");
//escrita do montante
            f1.write(String.valueOf((i.getAmount()).toString()));
            f1.write("</Amount>\n");

            f1.write("<Date>");
//escrita da data
            f1.write(String.valueOf(i.getDate().getDate()+"-"+(i.getDate().getMonth()+1)+"-"+(i.getDate().getYear()+1900)));
            f1.write("</Date>\n");

            f1.write("<IncomeType>");
//escrita do tipo
            f1.write(String.valueOf((i.getIncomeTypeString()).toString()));
            f1.write("</IncomeType>\n");

            f1.write("</Income>\n");
            
            tamanho_receitas--;

        }

        f1.write("</Expenses_Income>");
        f1.close();
    }
}