/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Model.PaymentMean;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i101132
 */
public class ExpensesControllerTest {
    
    public ExpensesControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getExpenseType method, of class ExpensesController.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        ExpensesController instance = new ExpensesController();
        List expResult = null;
        List result = instance.getExpenseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentMean method, of class ExpensesController.
     */
    @Test
    public void testGetPaymentMean() {
        System.out.println("getPaymentMean");
        ExpensesController instance = new ExpensesController();
        List expResult = null;
        List result = instance.getPaymentMean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createExpense method, of class ExpensesController.
     */
    @Test
    public void testCreateExpense() {
        System.out.println("createExpense");
        String what = "";
        Date date = null;
        BigDecimal amount = null;
        ExpenseType expType = null;
        PaymentMean pM = null;
        ExpensesController instance = new ExpensesController();
        instance.createExpense(what, date, amount, expType, pM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
