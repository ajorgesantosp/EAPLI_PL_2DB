/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
 * @author i101132
 */
public class IncomeTest {
    
    public IncomeTest() {
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
     * Test of getAmount method, of class Income.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Income instance = new Income();
        BigDecimal expResult = null;
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Income.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Income instance = new Income();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Income.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Income instance = new Income();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expenseToString method, of class Income.
     */
    @Test
    public void testExpenseToString() {
        System.out.println("expenseToString");
        Income instance = new Income();
        instance.expenseToString();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
