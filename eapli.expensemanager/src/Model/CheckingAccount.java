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
public class CheckingAccount extends Account {

     public List<Expense> listExpense;
     public BigDecimal saldoInicial;

    CheckingAccount(String ownerName, int id) {
        this.nomeOwner = ownerName;
        this.nConta = id;
        listExpense = new ArrayList<Expense>();
        listIncome = new ArrayList<Income>();
       
        saldoInicial=new BigDecimal(0);
        
    }

    public List<Expense> getListExpense() {
        return listExpense;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }
    
    public void setSaldoInicia(BigDecimal saldo){
        this.saldoInicial=saldo;
    }
    
    public BigDecimal getSaldo(){
        
        //(income-expenses)+saldoInicia
        return null;
    }
    
}
