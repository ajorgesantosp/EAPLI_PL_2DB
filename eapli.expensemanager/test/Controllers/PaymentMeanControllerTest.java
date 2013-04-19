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
 * @author i110512
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
    @Test(expected=IllegalArgumentException.class)
    public void testRegisterPaymentMean_empty() {
        System.out.println("registerPaymentMean");
        String description = "teste";
        String mean = "";
        PaymentMeanController instance = new PaymentMeanController();
        instance.registerPaymentMean(description, mean);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
