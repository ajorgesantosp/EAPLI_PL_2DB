
package Persistence.JPA;

import Model.ExpenseType;
import java.util.List;
import Persistence.Interfaces.ExpenseTypeRepository;

/**
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseTypeRepositoryImp implements ExpenseTypeRepository{

    @Override
    public void save(ExpenseType expType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpenseType FindExpenseTypes(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExpenseType> getAllExpenseType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
