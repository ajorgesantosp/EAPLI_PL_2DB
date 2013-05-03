/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
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
public class IPaymentMeanRepositoryTest {
    
    public IPaymentMeanRepositoryTest() {
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
     * Test of save method, of class IPaymentMeanRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        PaymentMean expType = null;
        IPaymentMeanRepository instance = new IPaymentMeanRepositoryImpl();
        instance.save(expType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPaymentMeanRepositoryImpl implements IPaymentMeanRepository {

        public void save(PaymentMean expType) {
        }
    }
}
