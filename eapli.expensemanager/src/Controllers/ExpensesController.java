/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.DebitCard;
import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistence.DebitCardRepository;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
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
    public List<DebitCard> getDebitCard() throws IllegalArgumentException {

        List<DebitCard> debitCards;

        DebitCardRepository debitRepository = new DebitCardRepository();

        //Lista completa dos cartões de debito
        debitCards = debitRepository.getAllDebitCard();

        if (debitCards == null) {
            throw new IllegalArgumentException();
        }

        return debitCards;
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
}
