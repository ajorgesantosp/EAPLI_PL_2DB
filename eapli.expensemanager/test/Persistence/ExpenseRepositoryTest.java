/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
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
public class ExpenseRepositoryTest {
    
    public ExpenseRepositoryTest() {
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
     * Test of save method, of class ExpenseRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Expense exp = null;
        ExpenseRepository instance = new ExpenseRepository();
        instance.save(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLast method, of class ExpenseRepository.
     */
    @Test
    public void testFindLast() {
        System.out.println("findLast");
        ExpenseRepository instance = new ExpenseRepository();
        Expense expResult = null;
        Expense result = instance.findLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class ExpenseRepository.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        ExpenseRepository instance = new ExpenseRepository();
        List expResult = null;
        List result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
