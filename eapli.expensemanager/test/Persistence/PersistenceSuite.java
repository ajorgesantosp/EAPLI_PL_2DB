/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author i101132
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Persistence.PaymentMeanRepositoryTest.class, Persistence.IExpenseRepositoryTest.class, Persistence.ExpenseTypeRepositoryTest.class, Persistence.IPaymentMeanRepositoryTest.class, Persistence.IExpenseTypeRepositoryTest.class, Persistence.ExpenseRepositoryTest.class})
public class PersistenceSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
