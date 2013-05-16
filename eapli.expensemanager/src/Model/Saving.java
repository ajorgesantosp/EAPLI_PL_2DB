/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i111114
 */
public class Saving {
    private String description;
    private boolean bought;

    public Saving(String description, boolean bought) {
        this.description = description;
        this.bought = bought;
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
    
    
}
