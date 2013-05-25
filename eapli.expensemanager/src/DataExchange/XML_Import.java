package DataExchange;

import Controllers.InsertIncomeController;
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

    public static void leitura(String file) throws Exception {

        String geral = "";
        String expenses = "";
        String incomes = "";
        RegisterExpenseController exp_controller = new RegisterExpenseController();
        InsertIncomeController  inc_controller = new InsertIncomeController();

        try {
            Scanner inputStream = new Scanner(new File(file+".xml"));

            while (inputStream.hasNext()) {

                geral += inputStream.nextLine();

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String values[] = geral.split("</Expenses>");
        geral = values[values.length-1];
        
        String [] expense_array = new String [values.length-1];
        
        for(int j=0;j<values.length-1;j++){
            
            String aux = values[j];
            String aux2 [] = aux.split("<Expenses>");
            expense_array[j]=aux2[1];
        }
        
        values = geral.split("</Income>");
        
        String income_array[] = new String [values.length-1];
        
        for(int j=0;j<values.length-1;j++){
            
            String aux3 = values[j];
            String aux4 [] = aux3.split("<Income>");
            income_array[j]=aux4[1];
            
        }

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

            String dats[] = data.split("-");
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

            String dats[] = data.split("-");
            int year = Integer.parseInt(dats[2]);
            int month = Integer.parseInt(dats[1]);
            int day = Integer.parseInt(dats[0]);
            Date date = new Date(year, month, day);
            
            String price = valor.replace("â‚¬", "");
            BigDecimal sPrice = new BigDecimal(price);
            
            IncomeType inc = new IncomeType(descricao, incometype);

            inc_controller.registerIncome(sPrice, date, descricao, inc);

        }
        
    }
}
