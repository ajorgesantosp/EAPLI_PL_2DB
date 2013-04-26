/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.exception.InvalidValue;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseTest {
    
    private ExpenseType expType;
    private PaymentMean payMean;
    private Date date;
    private BigDecimal amount;
    
    public ExpenseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        expType = new ExpenseType("Compras de Lazer", "Lazer");
        payMean = new PaymentMean("Compras com VISA:XXXXX", "Cartão de Debito");
        date = new Date(2013, 1, 10);
        amount = new BigDecimal(20);
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class) 
    public void expenseInvalidDate() throws InvalidValue{
        System.out.println("### expenseInvalidDate ###");
        System.out.println("    Result: IllegalArgumentException");
        Expense expense = new Expense("Teste", null, amount, expType, payMean);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void expenseInvalidAmount() throws InvalidValue{
        System.out.println("### expenseInvalidAmount ###");
        System.out.println("    Result: IllegalArgumentException");
        Expense expense = new Expense("Teste", date, null, expType, payMean);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void expenseInvalidExpenseType() throws InvalidValue{
        System.out.println("### expenseInvalidExpenseType ###");
        System.out.println("    Result: IllegalArgumentException");
        Expense expense = new Expense("Teste", date, amount, null, payMean);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void expenseInvalidPaymentMeans() throws InvalidValue{
        System.out.println("### expenseInvalidPaymentMeans ###");
        System.out.println("    Result: IllegalArgumentException");
        Expense expense = new Expense("Teste", date, amount, expType, null);
    }
    
    @Test(expected = eapli.exception.InvalidValue.class)
    public void expenseInvalidAmountValue() throws InvalidValue{
        System.out.println("### expenseInvalidAmountValue ###");
        System.out.println("    Result: InvalidValue");
        Expense expense = new Expense("Teste", date, new BigDecimal(0), expType, payMean);
    }
    
    @Test
    public void testEquals() throws InvalidValue {
        System.out.println("### expenseEquals ###");
        Object other = new Expense("Testes", date, amount, expType, payMean);
        Expense obj = new Expense("Testes", date, amount, expType, payMean);
        boolean expResult = true;
        boolean result = obj.equals(other);
        assertEquals(expResult, result);
        System.out.println("    Result: True");
    }
}