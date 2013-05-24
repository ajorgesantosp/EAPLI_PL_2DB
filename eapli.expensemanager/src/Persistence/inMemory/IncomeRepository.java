/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inMemory;

import Model.Expense;
import Model.Income;
import eapli.exception.EmptyList;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Repositorio em memoria de depositos
 *
 * @autor 1110186 & 1110590
 */
public class IncomeRepository implements Persistence.Interfaces.IncomeRepository{
    
    private static List<Income> listIncome = new ArrayList<Income>();
    
    public IncomeRepository(){}

    @Override
    public void save(Income inc) {
        if (inc == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(inc);
    }
    
    public List<Income> getList() throws EmptyList {
        List<Income> aExp = listIncome;
        if(aExp.isEmpty()){
            throw new EmptyList("Exception EmptyList");
        }
        
        return aExp;
    }
    
}
