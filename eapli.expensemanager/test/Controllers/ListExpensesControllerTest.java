/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class ListExpensesControllerTest {
    
    public ListExpensesControllerTest() {
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
     * Test of getWeeklyExpenses method, of class ListExpensesController.
     */
    @Test
    public void testGetWeeklyExpenses() {
        System.out.println("getWeeklyExpenses");
        ListExpensesController instance = new ListExpensesController();
        List expResult = null;
        List result = instance.getWeeklyExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListExpenditures method, of class ListExpensesController.
     */
    @Test
    public void testGetListExpenditures() {
        System.out.println("getListExpenditures");
        ListExpensesController instance = new ListExpensesController();
        List expResult = null;
        List result = instance.getListExpenditures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastMonthExpenses method, of class ListExpensesController.
     */
    @Test
    public void testGetLastMonthExpenses() {
        System.out.println("getLastMonthExpenses");
        ListExpensesController instance = new ListExpensesController();
        List expResult = null;
        List result = instance.getLastMonthExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
