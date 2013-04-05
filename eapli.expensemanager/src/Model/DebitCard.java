/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mafalda
 */
public class DebitCard {
    private String nameDC;
    private int numDC;
    
    protected DebitCard(){
        
    }
    
    public DebitCard(String nameDC_s,int numDC_s){
        this.nameDC=nameDC_s;
        this.numDC=numDC_s;
        
    }

    /**
     * @return the nameDC
     */
    public String getNameDC() {
        return nameDC;
    }

    /**
     * @return the numDC
     */
    public int getNumDC() {
        return numDC;
    }    
    
}
