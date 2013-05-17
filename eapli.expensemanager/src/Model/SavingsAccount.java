/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class SavingsAccount extends Account {
    private List<Saving> savings;
    
    public SavingsAccount(BigDecimal saldo, String nomeOwner, int nConta) {
        //super(saldo, nomeOwner, nConta);
        savings = new ArrayList<Saving>();
    }
    
    public void addSaving(Saving s)
    {
        savings.add(s);
    }
    

    


}
