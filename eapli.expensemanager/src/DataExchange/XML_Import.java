/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExchange;

import Controllers.RegisterExpenseController;
import Model.ExpenseType;
import Model.IncomeType;
import Model.PaymentMean;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public abstract class XML_Import {

    public static void leitura() throws Exception {

        String geral = "";
        String expenses = "";
        String incomes = "";
        RegisterExpenseController exp_controller = new RegisterExpenseController();
        //RegisterIncomeController  inc_controller = new RegisterIncomeController();

        try {
            Scanner inputStream = new Scanner(new File("export_xml.xml"));

            while (inputStream.hasNext()) {

                geral += inputStream.nextLine();

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String values[] = geral.split("</Income>");
        geral=values[0] ;
        values = geral.split("<Expenses>");
        geral=values[1] ;
        values = geral.split("</Expenses>");
        expenses = values[0]; //correcto
        incomes = values[1]; //falta cortar o <Income>
        values = incomes.split("<Income>");
        incomes = values[1];

        //fazer um split para guardar as cada despesas/receitas numa posiÃ§Ã£o de um array

        String expense_array[] = expenses.split("</ExpenseType>");
        String income_array[] = incomes.split("</IncomeType>");

        //ciclo para criar despesas

        for (int i = 0; i < expense_array.length; i++) {

            String completo = expense_array[i];

            /*Guarda a descriÃ§Ã£o*/

            values = completo.split("</Description>");
            String descricao = values[0];
            completo = values[1]; //tudo excecpto a descriÃ§Ã£o
            values = descricao.split("<Description>");
            descricao = values[1]; //descriÃ§Ã£o guardada

            /*Guardar o valor(amount)*/

            values = completo.split("</Amount>");
            String valor = values[0];
            completo = values[1];//tudo excecpto a descriÃ§Ã£o e o valor
            values = valor.split("<Amount>");
            valor = values[1]; //valor guardado

            /*Guardar a data*/

            values = completo.split("</Date>");
            String data = values[0];
            completo = values[1];//tudo excecpto a descriÃ§Ã£o, o valor e a data
            values = data.split("<Date>");
            data = values[1]; //data guardada

            /*Guardar o modo de pagamento*/

            values = completo.split("</PaymentMean>");
            String modo_pagamento = values[0];
            completo = values[1];//tudo excecpto a descriÃ§Ã£o, o valor, data e modo de pagamento
            values = modo_pagamento.split("<PaymentMean>");
            modo_pagamento = values[1]; //modo de pagamento guardado

            /*Guardar o type*/

            values = completo.split("<ExpenseType>");
            String expensetype = values[1]; //modo de pagamento guardado


            /*Tratamento dos dados de cada despesa*/

            String dats[] = data.split("//");
            int year = Integer.parseInt(dats[2]);
            int month = Integer.parseInt(dats[1]);
            int day = Integer.parseInt(dats[0]);
            Date date = new Date(year, month, day);
            
            String price = valor.replace("â‚¬", "");
            BigDecimal sPrice = new BigDecimal(price);
            
            ExpenseType e = new ExpenseType(descricao, expensetype);
            
            PaymentMean p = new PaymentMean(descricao, modo_pagamento);

            exp_controller.createExpense(descricao, date, sPrice, e, p);

        }
        
        //ciclo para as receitas
        
        for (int i = 0; i < income_array.length; i++) {

            String completo = income_array[i];

            /*Guarda a descriÃ§Ã£o*/

            values = completo.split("</Description>");
            String descricao = values[0];
            completo = values[1]; //tudo excecpto a descriÃ§Ã£o
            values = descricao.split("<Description>");
            descricao = values[1]; //descriÃ§Ã£o guardada

            /*Guardar o valor(amount)*/

            values = completo.split("</Amount>");
            String valor = values[0];
            completo = values[1];//tudo excecpto a descriÃ§Ã£o e o valor
            values = valor.split("<Amount>");
            valor = values[1]; //valor guardado

            /*Guardar a data*/

            values = completo.split("</Date>");
            String data = values[0];
            completo = values[1];//tudo excecpto a descriÃ§Ã£o, o valor e a data
            values = data.split("<Date>");
            data = values[1]; //data guardada

            /*Guardar o modo de pagamento*/

            values = completo.split("<IncomeType>");
            String incometype = values[1]; //income type guardado
            


            /*Tratamento dos dados de cada receita*/

            String dats[] = data.split("//");
            int year = Integer.parseInt(dats[2]);
            int month = Integer.parseInt(dats[1]);
            int day = Integer.parseInt(dats[0]);
            Date date = new Date(year, month, day);
            
            String price = valor.replace("â‚¬", "");
            BigDecimal sPrice = new BigDecimal(price);
            
            IncomeType inc = new IncomeType(descricao, incometype);

            //inc_controller.createIncome(descricao, date, sPrice, inc);

        }
        
    }
}