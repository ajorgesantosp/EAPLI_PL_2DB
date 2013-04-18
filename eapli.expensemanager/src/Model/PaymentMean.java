/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i101068
 */
public class PaymentMean extends BaseType{
    
    private String mean;
    
    public PaymentMean(String description, String mean)
    {
        super(description);
        this.mean = mean;
    }

    /**
     * @return the mean
     */
    public String getMean() {
        return mean;
    }

    /**
     * @param mean the mean to set
     */
    public void setMean(String mean) {
        this.mean = mean;
    }
    
    @Override
    public String toString(){
        return  "PaymentMean: " + this.mean + " Description: " + this.description;
    }
}
