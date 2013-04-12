/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.PaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nbento
 */
public class ExpensesController {

    /**
     * @autor nbento
     * @return
     * @throws IllegalArgumentException
     */
    public List<ExpenseType> getExpenseType() throws IllegalArgumentException {

        List<ExpenseType> expenseTypes;

        ExpenseTypeRepository expenseTypeRepository = new ExpenseTypeRepository();

        //Lista completa dos tipos de despesas
        expenseTypes = expenseTypeRepository.getAllExpenseType();

        if (expenseTypes == null) {
            throw new IllegalArgumentException();
        }

        return expenseTypes;


    }

    /**
     * @autor nbento
     * @return
     * @throws IllegalArgumentException
     */
    public List<PaymentMean> getPaymentMean() throws IllegalArgumentException {

        List<PaymentMean> paymentMeans;

        PaymentMeansRepository payMeansRepository = new PaymentMeansRepository();

        //Lista completa dos cartões de debito
        paymentMeans = payMeansRepository.getAllExpenseType();

        if (paymentMeans == null) {
            throw new IllegalArgumentException();
        }

        return paymentMeans;
    }

    /**
     * return the last Expense recorded
     *
     * @return
     */
    public Expense getLastExpense() {
        ExpenseRepository er = new ExpenseRepository();
        return er.findLast();
    }

    public List<Expense> getLastMonthExpenses() {

        ExpenseRepository repo = new ExpenseRepository();

        return repo.getLastMonthExpense();


    }

    public List<Expense> getListExpenditures() {
        ExpenseRepository exprep = new ExpenseRepository();
        List<Expense> aExp = exprep.getList();

        return aExp;
    }

    public void registerExpense(String what, Date date, BigDecimal amount, String mean) {
        PaymentMean pm = new PaymentMean(mean);
        Expense expense = new Expense(what, date, amount, pm);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }
    
       public List<Expense> getWeeklyExpenses(){

        ExpenseRepository exprep=new ExpenseRepository();
        List<Expense> aExp=exprep.getWeeklyExpenses();
        return aExp;
        
        
    }
}
