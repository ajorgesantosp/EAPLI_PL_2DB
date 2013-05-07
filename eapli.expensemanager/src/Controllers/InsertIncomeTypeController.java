package Controllers;

import Model.IncomeType;
import Persistence.inMemory.IncomeTypeRepository;

/*
 * @autor 1110186 & 1110590
 */
public class InsertIncomeTypeController {
    
    public void registerIncomeType(String type, String description){
        
        IncomeType incomeType = new IncomeType(type, description);
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(incomeType);
        
    }
    
}
