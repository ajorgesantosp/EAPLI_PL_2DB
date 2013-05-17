/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import java.util.Comparator;
import javax.persistence.ManyToOne;
/**
 *
 * @author dg5s5dfsd5fs5d
 */
@Entity
public class ExpenseType extends BaseType {

    private String type;

    protected ExpenseType() {
    }

    public ExpenseType(String description, String type) {
        super(description);
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

    @Override
    public String toString() {
        return type;
    }

    /**
     * Comparação de objectos
     *
     * @autor 1110186 & 1110590
     * @param other - Objecto a ser comparado
     * @return True -> Objectos iguais | False -> Objectos diferentes
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;

        if (other instanceof ExpenseType) {
            ExpenseType that = (ExpenseType) other;
            result = (this.description.equalsIgnoreCase(that.description) 
                    && this.type.equalsIgnoreCase(that.type));
        }

        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }

     /**
     * Comparator
     *
     * @autor 1110186 & 1110590
     * @param ExpenseType et1 e ExpenseType et2
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
     */
    
    public static Comparator<ExpenseType> ExpenseTypeNameComparator=new Comparator<ExpenseType>(){
        @Override
        public int compare(ExpenseType et1,ExpenseType et2){
            String typeName1=et1.getType().toUpperCase();
            String typeName2=et2.getType().toUpperCase();
            
            return typeName1.compareTo(typeName2);
        }
    };
}
