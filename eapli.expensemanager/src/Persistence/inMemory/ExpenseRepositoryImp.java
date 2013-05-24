/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inMemory;

import Model.*;
import Persistence.Interfaces.ExpenseRepository;
import java.util.ArrayList;
import java.util.List;
import eapli.exception.*;

/**
 * Classe Repositorio em memoria de despesas
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseRepositoryImp implements ExpenseRepository {

    private static List<Expense> listExpense = new ArrayList<Expense>();

    public ExpenseRepositoryImp() {
    }

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
        Persistence.JPA.ExpenseRepositoryImp JPA = new Persistence.JPA.ExpenseRepositoryImp();
        JPA.save(exp);
    }

    
    public Expense findLast() throws EmptyList {

        if (listExpense.isEmpty()) {
            throw new EmptyList("Exception EmptyList");
        } else {
            Expense exp = listExpense.get(listExpense.size() - 1);
            return exp;
        }
    }

    public List<Expense> getList() throws EmptyList {
        List<Expense> aExp = listExpense;
        if(aExp.isEmpty()){
            throw new EmptyList("Exception EmptyList");
        }
        
        return aExp;
    }
    
}
