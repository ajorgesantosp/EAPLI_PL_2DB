/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Goal;
import Persistence.inMemory.GoalsRepository;

/**
 *
 * @author i111114
 */
public class GoalsController {
    public void registerGoal(String description, boolean bought, float price, float cost)
    {
        if(description.equals(""))
        {
            throw new IllegalArgumentException();
        } else {
            Goal goal = new Goal(description,bought,price, cost);
            GoalsRepository repo = new GoalsRepository();
            repo.save(goal);
        }
    }
}
