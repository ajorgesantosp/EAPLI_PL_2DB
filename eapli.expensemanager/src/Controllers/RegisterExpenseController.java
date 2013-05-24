package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import Model.RecordExpense;
import Persistence.inMemory.ExpenseTypeRepositoryImp;
import Persistence.inMemory.PaymentMeanRepositoryImp;
import eapli.exception.EmptyList;
import eapli.exception.InvalidValue;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * *
 * @autor 1110186 & 1110590
 *
 */
public class RegisterExpenseController extends BaseController {

    /**
     * @autor 1110186 & 1110590
     * @return List com todos os tipos de despesas
     * @throws IllegalArgumentException, EmptyList
     */
    public List<ExpenseType> getExpenseType() throws IllegalArgumentException, EmptyList {

        List<ExpenseType> expenseTypes;

        ExpenseTypeRepositoryImp expenseTypeRepository = new ExpenseTypeRepositoryImp();

        //Lista completa dos tipos de despesas
        expenseTypes = expenseTypeRepository.getAllExpenseType();

        if (expenseTypes.isEmpty()) {
            throw new EmptyList("Exception EmptyList");
        }

        return expenseTypes;

    }

    /**
     * @autor 1110186 & 1110590
     * @return List com todos os meios de pagamento
     * @throws IllegalArgumentException, EmptyList
     */
    public List<PaymentMean> getPaymentMean() throws IllegalArgumentException, EmptyList {

        List<PaymentMean> paymentMeans;

        PaymentMeanRepositoryImp payMeansRepository = new PaymentMeanRepositoryImp();

        //Lista completa dos cartões de debito
        paymentMeans = payMeansRepository.getAllPaymentMean();
        
        if (paymentMeans.isEmpty()) {
            throw new EmptyList("Exception EmptyList");
        }

        return paymentMeans;
    }

    /**
     * @autor 1110186 & 1110590
     * @return
     */
    public void createExpense(String what, Date date, BigDecimal amount, ExpenseType expType, PaymentMean pM) {
        try {
            Expense expense = new Expense(what, date, amount, expType, pM);

            RecordExpense repo = new RecordExpense();
            repo.register(expense);
        } catch (InvalidValue ex) {
            System.err.println(ex.getMessage());
        }
    }

}
