/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class BaseControllerTest {
    
    public BaseControllerTest() {
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
     * Test of showWeeklyExpenses method, of class BaseController.
     */
    @Test
    public void testShowWeeklyExpenses() {
        System.out.println("showWeeklyExpenses");
        BaseController instance = new BaseControllerImpl();
        instance.showWeeklyExpenses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShowlastMonthExpensesLoop method, of class BaseController.
     */
    @Test
    public void testShowlastMonthExpensesLoop() {
        System.out.println("ShowlastMonthExpensesLoop");
        BaseController instance = new BaseControllerImpl();
        instance.ShowlastMonthExpensesLoop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseControllerImpl extends BaseController {
    }
}
