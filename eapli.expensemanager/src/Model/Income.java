/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author i100905
 */
public class Income {
    
    String description;
   
    BigDecimal amount;
    
    IncomeType type;
    
    Date d;
    
    protected Income() {}
    
    public Income( String description, Date dateOccurred, BigDecimal amount, IncomeType type) {
        if (description == null || dateOccurred == null || amount == null || type == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR income
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.type=type;
        
    }
    
    public Income(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.d = dateOccurred;
    }
    
    public Income( String description, int year, int month, int day, BigDecimal amount) {
        this( description, DateTime.newDate(year, month, day), amount);
    }
    
   
    
    public Income( String description, int year, int month, int day, BigDecimal amount,IncomeType type) {
        this( description, DateTime.newDate(year, month, day), amount);
        this.type=type;
    }
    
    
    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription(){
        return description;
    }
    
     public Date getDate() {


        return this.d;
    }

    public void expenseToString() {

        
        int ano=this.d.getYear();
        //fix corrigir o bug no getYear do Date
        ano=ano+1900+1900;

        System.out.println("**********************************");
        System.out.println("Descriçao: " + this.description);
        System.out.println("Data: " + this.d.getDate()+"/"+this.d.getMonth()+"/"+ano);
        System.out.println("Valor: " + this.getAmount().doubleValue());
        System.out.println("**********************************\n");

    }
   
}