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
    private float price;


    public Saving(String description, boolean bought, float price) {
        this.description = description;
        this.bought = bought;
        this.price = price;
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
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
