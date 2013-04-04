/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dg5s5dfsd5fs5d
 */

public class ExpenseType {
    
    private String type;

    protected ExpenseType() {}

    public ExpenseType(String type) {
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
}
