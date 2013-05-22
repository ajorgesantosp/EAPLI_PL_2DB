/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author i100905
 */
@Entity
public class Income extends BaseType {

    BigDecimal amount;
    @ManyToOne(cascade = CascadeType.ALL)
    IncomeType type;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date d;

    protected Income() {
    }

    public Income(String description, Date dateOccurred, BigDecimal amount, IncomeType type) {
        if (description == null || dateOccurred == null || amount == null || type == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR income
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.d = dateOccurred;

    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {


        return this.d;
    }

    public String getIncomeType(){
        return type.getDescription();
    }
    
    
    public void incomeToString() {


        int ano = this.d.getYear();
        //fix corrigir o bug no getYear do Date
        if (ano >= 2000 || ano < 0) {
            ano = ano + 1900 + 1900;
        }

        System.out.println("**********************************");
        System.out.println("Descriçao: " + this.description);
        System.out.println("Data: " + this.d.getDate() + "/" + this.d.getMonth() + "/" + ano);
        System.out.println("Valor: " + this.getAmount().doubleValue());
        System.out.println("**********************************\n");

    }

    /**
     * Comparação de objectos
     *
     * @autor 1110186 & 1110590
     * @param other - Objecto a comparar
     * @return True -> Objectos iguais | False -> Objectos diferentes
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;

        if (other instanceof Income) {
            Income that = (Income) other;
            result = (this.description.equalsIgnoreCase(that.description)
                    && this.d.equals(that.d)
                    && this.amount == that.amount
                    && this.type.equals(that.type));
        }

        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 29 * hash + (this.amount != null ? this.amount.hashCode() : 0);
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 29 * hash + (this.d != null ? this.d.hashCode() : 0);
        return hash;
    }
}