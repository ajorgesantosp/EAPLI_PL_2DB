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
public class Account {
    
    BigDecimal saldo;
    String nomeOwner;
    int nConta;
    
   
    List<Income> listIncome;
   
  
    Account(){
       
    }
    
    void setSaldoInicial(BigDecimal saldo){
             
       // if(re.setSaldo(saldo))
       //     this.saldo=saldo;    
        
    }
}
