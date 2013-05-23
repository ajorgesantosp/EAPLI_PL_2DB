/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExchange;

import Model.Expense;
import Model.Income;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Ruben
 */
public  class CSV_Export {

    public  static void createCsvFile(String d1, String d2, List<Expense> despesas, List<Income> receitas) {
//A estrutura try-catch Ã© usada pois o objeto BufferedWriter exige que as
//excessÃµes sejam tratadas
        try {
       int a= (int) Math.PI;
//CriaÃ§Ã£o de um buffer para a escrita em uma stream
            BufferedWriter StrW = new BufferedWriter(new FileWriter("dados.csv"));

//Escrita dos dados da tabela
            StrW.write("Expense;Description;Amount;ExpenseType;PaymentMean;Date\n");
            
            int tamanho_despesas = despesas.size()-1;
            
            while(tamanho_despesas>0){
            
                Expense e = despesas.get(tamanho_despesas);
                
            StrW.write(e.getId()+";"+e.getDescription()+";"+e.getAmount()+";"+e.getType()+";"+e.getPaymentMeanString()+
                        ";"+e.getDate().getDate()+"-"+(e.getDate().getMonth()+1)+"-"+(e.getDate().getYear()+1900)+"\n");
            
            tamanho_despesas--;
            }
            
            StrW.write("\n");
            
            StrW.write("Income;Description;Amount;IncomeType;Date\n");
            
            int tamanho_receitas = receitas.size()-1;
            
            while(tamanho_receitas>0){
            
                Income i = receitas.get(tamanho_receitas);
                
           StrW.write(i.getId()+";"+i.getDescription()+";"+i.getAmount()+";"+i.getIncomeTypeString()+";"+
                   +i.getDate().getDate()+"-"+(i.getDate().getMonth()+1)+"-"+(i.getDate().getYear()+1900)+"\n");
            
            tamanho_receitas--;
            }

            StrW.write("\n");
            
//Fechamos o buffer
            StrW.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}