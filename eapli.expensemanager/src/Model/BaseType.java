/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pedro
 */
public class BaseType {
    
    int id;
    
    String description;

    public BaseType(int id, String description){
        if (description == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (id == -1) {
            throw new IllegalArgumentException();
        }
        
        this.id=id;
        this.description=description;
        
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
