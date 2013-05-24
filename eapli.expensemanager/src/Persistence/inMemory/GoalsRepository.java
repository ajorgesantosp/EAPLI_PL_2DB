/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inMemory;

import Model.Goal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i111114
 */
public class GoalsRepository implements Persistence.Interfaces.GoalsRepository{
    private static List<Goal> listExpense = new ArrayList<Goal>();
    @Override
    public Goal finfForName(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Goal save(Goal goal) {
        listExpense.add(goal);
        return goal;
    }

    @Override
    public List<Goal> all() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
