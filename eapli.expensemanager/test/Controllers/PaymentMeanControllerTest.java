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
 * @author i111114
 */
public class PaymentMeanControllerTest {
    
    public PaymentMeanControllerTest() {
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
     * Test of registerPaymentMean method, of class PaymentMeanController.
     */
    @Test
    public void testRegisterPaymentMean() {
        System.out.println("registerPaymentMean");
        String description = "";
        String mean = "";
        PaymentMeanController instance = new PaymentMeanController();
        boolean expResult = false;
        boolean result = instance.registerPaymentMean(description, mean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
