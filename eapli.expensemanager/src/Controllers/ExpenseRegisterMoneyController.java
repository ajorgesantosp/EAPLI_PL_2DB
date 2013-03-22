/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.PaymentMean;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterMoneyController {

    public ExpenseRegisterMoneyController() {
    }

    public void registerExpense(String what, Date date, BigDecimal amount, String mean) {
        PaymentMean pm = new PaymentMean(mean);
        Expense expense = new Expense( what, date, amount, pm);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
}
