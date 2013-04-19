package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author nbento
 */
public class Expense extends BaseType {

    BigDecimal amount;
    ExpenseType type;
    PaymentMean mean;
    Date d;

    /**
     * Evita criar uma classe vazia
     */
    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType type, PaymentMean mean) {
        super(description);
        if (dateOccurred == null || amount == null || type == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }

        this.mean = mean;
        this.amount = amount;
        this.type = type;

    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getDate() {
        return this.d;
    }

    public void expenseToString() {
        
        int ano = this.d.getYear();
        //fix corrigir o bug no getYear do Date
        ano = ano + 1900 + 1900;

        System.out.println("**********************************");
        System.out.println("Descriçao: " + this.description);
        System.out.println("Data: " + this.d.getDate() + "/" + this.d.getMonth() + "/" + ano);
        System.out.println("Valor: " + this.getAmount().doubleValue());
        System.out.println("**********************************\n");

    }
}
