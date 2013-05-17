package Persistence;

import Persistence.Interfaces.*;

/**
 *
 * @autor 1110186 & 1110590
 */
public interface RepositoryFactory {
    
    ExpenseRepository expenseRepository();
    IncomeRepository incomeRepository();
    IncomeTypeRepository incomeTypeRepository();
    PaymentMeanRepository paymentMeanRepository();
    
}
