/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Filipe
 */
public class SavingsAccount extends Account {

    

    SavingsAccount(String ownerName, int id) {
        this.nomeOwner = ownerName;
        this.nConta = id;
        
        this.listIncome = new ArrayList<Income>();


        

    }
}
