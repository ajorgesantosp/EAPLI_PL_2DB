/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i100905
 */
public class IncomeType {
    
    private String type;

    protected IncomeType() {}

    public IncomeType(String type) {
        this.type = type;
        }
    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    public String toString(){
            return type;
    }
}

