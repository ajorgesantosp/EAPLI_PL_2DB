/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.inMemory.ExpenseTypeRepositoryImp;
import Model.ExpenseType;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mint
 */
public class ExpenseTypeRepositoryTest {
    
    public ExpenseTypeRepositoryTest() {
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
     * Test of save method, of class ExpenseTypeRepositoryImp.
     */
    @Test
    public void testSaveDuplicate() {
        
    }
    
    /**
     * Test of ListExpenseTypes method, of class ExpenseTypeRepositoryImp.
     */
    @Test
    public void testListExpenseTypes() {
        System.out.println("ListExpenseTypes");
        ExpenseTypeRepositoryImp instance = new ExpenseTypeRepositoryImp();
        List expResult = null;
        List result = instance.ListExpenseTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllExpenseType method, of class ExpenseTypeRepositoryImp.
     */
    @Test
    public void testGetAllExpenseType() {
        System.out.println("getAllExpenseType");
        ExpenseTypeRepositoryImp instance = new ExpenseTypeRepositoryImp();
        List expResult = null;
        List result = instance.getAllExpenseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}