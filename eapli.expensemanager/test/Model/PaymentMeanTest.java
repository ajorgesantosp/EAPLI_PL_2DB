/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class PaymentMeanTest {
    
    public PaymentMeanTest() {
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
     * Test of getMean method, of class PaymentMean.
     */
    @Test
    public void testGetMean() {
        System.out.println("getMean");
        PaymentMean instance = null;
        String expResult = "";
        String result = instance.getMean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMean method, of class PaymentMean.
     */
    @Test
    public void testSetMean() {
        System.out.println("setMean");
        String mean = "";
        PaymentMean instance = null;
        instance.setMean(mean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PaymentMean.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PaymentMean instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
