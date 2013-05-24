
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.inMemory.IncomeRepositoryImp;
import Persistence.inMemory.IncomeTypeRepositoryImp;
import eapli.exception.EmptyList;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/*
 * @autor 1110186 & 1110590
 */
public class InsertIncomeController {
    
    /**
     * @autor 1110186 & 1110590
     * @return List com todos os tipos de receitas
     * @throws IllegalArgumentException, EmptyList
     */
    public List<IncomeType> getAllIncomeType() throws IllegalArgumentException, EmptyList {

        List<IncomeType> incomeTypes;

        IncomeTypeRepositoryImp incomeTypeRepository = new IncomeTypeRepositoryImp();

        //Lista completa dos tipos de receitas
        incomeTypes = incomeTypeRepository.getAllIncomeType();

        if (incomeTypes.isEmpty()) {
            throw new EmptyList("Exception EmptyList");
        }

        return incomeTypes;

    }
    
    public void registerIncome(BigDecimal amount, Date date, String description, IncomeType incomeType){
        
        Income inc = new Income(description, date, amount, incomeType);
        IncomeRepositoryImp repo = new IncomeRepositoryImp();
        repo.save(inc);
        
    }
}
