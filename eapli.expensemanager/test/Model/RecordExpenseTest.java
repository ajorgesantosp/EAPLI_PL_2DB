/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class RecordExpenseTest {
    
    public RecordExpenseTest() {
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
     * Test of loadRepository method, of class RecordExpense.
     */
    @Test
    public void testLoadRepository() {
        System.out.println("loadRepository");
        RecordExpense instance = new RecordExpense();
        instance.loadRepository();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class RecordExpense.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Expense exp = null;
        RecordExpense instance = new RecordExpense();
        instance.register(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListExpenditures method, of class RecordExpense.
     */
    @Test
    public void testGetListExpenditures() {
        System.out.println("getListExpenditures");
        RecordExpense instance = new RecordExpense();
        List expResult = null;
        List result = instance.getListExpenditures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeklyExpenses method, of class RecordExpense.
     */
    @Test
    public void testGetWeeklyExpenses() {
        System.out.println("getWeeklyExpenses");
        RecordExpense instance = new RecordExpense();
        List expResult = null;
        List result = instance.getWeeklyExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastMonthExpense method, of class RecordExpense.
     */
    @Test
    public void testGetLastMonthExpense() {
        System.out.println("getLastMonthExpense");
        RecordExpense instance = new RecordExpense();
        List expResult = null;
        List result = instance.getLastMonthExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLast method, of class RecordExpense.
     */
    @Test
    public void testFindLast() {
        System.out.println("findLast");
        RecordExpense instance = new RecordExpense();
        Expense expResult = null;
        Expense result = instance.findLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
