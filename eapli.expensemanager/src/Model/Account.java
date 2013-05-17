/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class Account {
    
    double saldo;
    String nomeOwner;
    int nConta;
    
    List<Expense> listExpense;
    List<Income> listIncome;
   
  
    Account(){
       
    }
    
    void setSaldoInicial(double saldo){
             
       // if(re.setSaldo(saldo))
       //     this.saldo=saldo;    
        
    }
}
