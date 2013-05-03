/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
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
public class ExpensesUITest {
    
    public ExpensesUITest() {
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
     * Test of doShow method, of class ExpensesUI.
     */
    @Test
    public void testDoShow() {
        System.out.println("doShow");
        ExpensesUI instance = new ExpensesUI();
        instance.doShow();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastMonthExpensesLoop method, of class ExpensesUI.
     */
    @Test
    public void testLastMonthExpensesLoop() {
        System.out.println("lastMonthExpensesLoop");
        ExpensesUI instance = new ExpensesUI();
        instance.lastMonthExpensesLoop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListExpenditures method, of class ExpensesUI.
     */
    @Test
    public void testListExpenditures() {
        System.out.println("ListExpenditures");
        ExpensesUI instance = new ExpensesUI();
        instance.ListExpenditures();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeklyExpenses method, of class ExpensesUI.
     */
    @Test
    public void testGetWeeklyExpenses() {
        System.out.println("getWeeklyExpenses");
        ExpensesUI instance = new ExpensesUI();
        instance.getWeeklyExpenses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getController method, of class ExpensesUI.
     */
    @Test
    public void testGetController() {
        System.out.println("getController");
        ExpensesUI instance = new ExpensesUI();
        BaseController expResult = null;
        BaseController result = instance.getController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
