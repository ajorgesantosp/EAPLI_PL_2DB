/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
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
public class PaymentMeanRepositoryTest {
    
    public PaymentMeanRepositoryTest() {
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
     * Test of save method, of class PaymentMeanRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        PaymentMean pay = null;
        PaymentMeanRepository instance = new PaymentMeanRepository();
        instance.save(pay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListExpenseTypes method, of class PaymentMeanRepository.
     */
    @Test
    public void testListExpenseTypes() {
        System.out.println("ListExpenseTypes");
        PaymentMeanRepository instance = new PaymentMeanRepository();
        List expResult = null;
        List result = instance.ListExpenseTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPaymentMean method, of class PaymentMeanRepository.
     */
    @Test
    public void testGetAllPaymentMean() {
        System.out.println("getAllPaymentMean");
        PaymentMeanRepository instance = new PaymentMeanRepository();
        List expResult = null;
        List result = instance.getAllPaymentMean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
