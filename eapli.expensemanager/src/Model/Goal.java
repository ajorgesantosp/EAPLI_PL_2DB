/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i111114
 */
public class Goal {
    private String description;
    private boolean bought;
    private float accumulated;
    private float cost;


    public Goal(String description, boolean bought, float accumulated, float cost) {
        this.description = description;
        this.bought = bought;
        this.accumulated = accumulated;
        this.cost = cost;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the bought
     */
    public boolean isBought() {
        return bought;
    }

    /**
     * @param bought the bought to set
     */
    public void setBought(boolean bought) {
        this.bought = bought;
    }

    /**
     * @return the price
     */
    public float getAccumulated() {
        return accumulated;
    }

    /**
     * @param price the price to set
     */
    public void setAccumulated(float price) {
        this.accumulated = price;
    }
    
    
}
