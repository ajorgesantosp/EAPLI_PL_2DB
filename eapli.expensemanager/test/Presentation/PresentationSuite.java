/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

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
@Suite.SuiteClasses({Presentation.ListExpenseTypeUITest.class, Presentation.ListPaymentMeanUITest.class, Presentation.ExpenseRegisterUITest.class, Presentation.RegisterPaymentMeanUITest.class, Presentation.RegisterExpenseTypeUITest.class, Presentation.MainMenuTest.class, Presentation.ExpensesUITest.class, Presentation.ExpenseManagerTest.class, Presentation.BaseUITest.class})
public class PresentationSuite {

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
