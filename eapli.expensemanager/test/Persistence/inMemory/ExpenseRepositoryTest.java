
package Persistence.inMemory;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import eapli.exception.EmptyList;
import eapli.exception.InvalidValue;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @autor 1110186 & 1110590
 */
public class ExpenseRepositoryTest {
    
    private static Expense exp;
    
    public ExpenseRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws InvalidValue {
        System.out.println("...Iniciar Testes...");
        exp = new Expense("Teste Despesa", new Date(2012,10,10), new BigDecimal(2.50), new ExpenseType("Despesa de Lazer", "Lazer"), new PaymentMean("Banco do Porto", "BPI"));
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("...Terminando Testes...");
    }

    @Test(expected = eapli.exception.EmptyList.class)
    public void testGetList() throws EmptyList {
        System.out.println("### getList ###");
        ExpenseRepository repo = new ExpenseRepository();
        repo.getList();
    }
    
    @Test
    public void testSave() throws EmptyList {
        System.out.println("### saveRepository ###");
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(exp);
        
        Expense expGetRepo = repo.findLast();
        
        assertEquals(exp, expGetRepo);
    }


    @Test
    public void testFindLast() throws EmptyList, InvalidValue {
        System.out.println("### findLast ###");
        ExpenseRepository repo = new ExpenseRepository();

        Expense expResult = new Expense("Teste 2 Despesa", new Date(2011,10,10), new BigDecimal(3), new ExpenseType("Despesa de Alimentação", "Alimentação"), new PaymentMean("Banco de Lisboa", "BPI"));
        repo.save(expResult);
        Expense result = repo.findLast();
        
        assertEquals(expResult, result);
        
    }
}