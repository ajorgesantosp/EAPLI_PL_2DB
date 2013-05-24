package Model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import java.util.Comparator;
/**
 *
 * @author 1100905  & 1070413
 */

public class ExpenseTA {

    
    private ExpenseType type;
    private BigDecimal amount;

    protected ExpenseTA() {
    }

    public ExpenseTA(ExpenseType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public ExpenseType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ExpenseType type) {
        this.type = type;
    }
    
    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Expense Type-Amount:\nType= " + type + "\namount= " + amount + '\n';
    }

  

   
}