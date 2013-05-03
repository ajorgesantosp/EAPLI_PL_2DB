/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
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
public class BaseUITest {
    
    public BaseUITest() {
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
     * Test of doShow method, of class BaseUI.
     */
    @Test
    public void testDoShow() {
        System.out.println("doShow");
        BaseUI instance = new BaseUIImpl();
        instance.doShow();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getController method, of class BaseUI.
     */
    @Test
    public void testGetController() {
        System.out.println("getController");
        BaseUI instance = new BaseUIImpl();
        BaseController expResult = null;
        BaseController result = instance.getController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBalance method, of class BaseUI.
     */
    @Test
    public void testShowBalance() {
        System.out.println("showBalance");
        BaseUI instance = new BaseUIImpl();
        instance.showBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseUIImpl extends BaseUI {

        public void doShow() {
        }

        public BaseController getController() {
            return null;
        }
    }
}
