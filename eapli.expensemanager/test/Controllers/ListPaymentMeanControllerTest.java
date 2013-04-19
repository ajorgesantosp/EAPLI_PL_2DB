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
 * @author i110512
 * @author i111114 
 */
public class ListPaymentMeanControllerTest {
    
    public ListPaymentMeanControllerTest() {
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
     * Test of listPaymentMean method, of class ListPaymentMeanController.
     */
    @Test(expected = NullPointerException.class)
    public void testListPaymentMean() {
        System.out.println("listPaymentMean");
        ListPaymentMeanController instance = new ListPaymentMeanController();
        List expResult = null;
        List result = instance.listPaymentMean();
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
