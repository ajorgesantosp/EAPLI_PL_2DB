/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
@Suite.SuiteClasses({Controllers.BaseControllerTest.class, Controllers.ListExpenseTypeControllerTest.class, Controllers.ListExpensesControllerTest.class, Controllers.RegisterExpenseControllerTest.class, Controllers.ExpensesControllerTest.class, Controllers.RecordExpensesControllerTest.class, Controllers.ExpenseTypeControllerTest.class, Controllers.PaymentMeanControllerTest.class, Controllers.ListPaymentMeanControllerTest.class})
public class ControllersSuite {

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
