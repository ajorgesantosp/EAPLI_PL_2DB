/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110512
 * @author i111114 
 */
public class PaymentMeanRepository implements IPaymentMeanRepository{
    private static List<PaymentMean> listPaymentMean= new ArrayList<PaymentMean>();

    public PaymentMeanRepository() {}
    
    public void save(PaymentMean pay)
    {
        if (pay==null) throw new IllegalArgumentException();
        listPaymentMean.add(pay);
        
    }
    
    public PaymentMean find(String pay)
    {
        for(PaymentMean o : listPaymentMean){
            if(o.getMean().equals(pay)) {
                return o;
            }
        }
        System.out.println("PaymentMean "+pay+"not found!");
        return null;
    }
    
    public List ListExpenseTypes(){
        
     //    for(Object o : listExpenseType){
      //      System.out.println(o+""+((ExpenseTypeRepository)o));
                
      //  }
      return listPaymentMean;
    }
    
    
    public List<PaymentMean> getAllPaymentMean(){
        
        return new ArrayList<PaymentMean>(listPaymentMean);
    }
    
}

