/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Interfaces;

import Model.Goal;
import java.util.List;

/**
 *
 * @author i111114
 */
public interface GoalsRepository {
    Goal finfForName(String key);
    Goal save(Goal goal);
    public List<Goal> all();
}
