/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @au0000000000000000000000000000000000000000thor Filipe
 */
public class CheckingAccount extends Account {

     //public List<Expense> listExpense;
     public BigDecimal saldoInicial;

    CheckingAccount(String ownerName, int id) {
        this.nomeOwner = ownerName;
        this.nConta = id;
       // listExpense = new ArrayList<Expense>();
        //listIncome = new ArrayList<Income>();
       
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
    
    public BigDecimal getAllExpenses(){
        
        BigDecimal expenses=new BigDecimal(0);
        for(Expense e : listExpense){
        
            expenses=expenses.add(e.getAmount());
        }
        return expenses;
        
    }
    
    public BigDecimal getAllIncome(){
        
        BigDecimal incomes=new BigDecimal(0);
        for(Income i : listIncome){
        
            incomes=incomes.add(i.getAmount());
        }
        return incomes;
    
    }
    public BigDecimal getSaldo(){
        
        //(income-expenses)+saldoInicia
        BigDecimal saldo=new BigDecimal(0);
        
        //Calcula saldo Income-expenses
        saldo=getAllIncome().subtract(getAllExpenses());
        
        //adiciona o saldo inicial para apresentar o saldo correto
        saldo.add((getSaldoInicial()));
        
        return null;
    }
    
}
