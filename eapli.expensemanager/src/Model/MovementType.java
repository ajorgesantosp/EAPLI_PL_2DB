/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Filipe
 */
public abstract class MovementType implements Serializable {
    
     
    
    
    String description;
    

    MovementType() {
    }

    
    MovementType(String desc) {
    this.description=desc;
    
    
    }
    
    public String getDescripiton(){
    return description;    
    }
    
    
    
    
}
