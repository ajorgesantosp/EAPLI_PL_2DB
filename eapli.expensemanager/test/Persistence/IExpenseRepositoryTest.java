/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
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
public class IExpenseRepositoryTest {
    
    public IExpenseRepositoryTest() {
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
     * Test of save method, of class IExpenseRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Expense exp = null;
        IExpenseRepository instance = new IExpenseRepositoryImpl();
        instance.save(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IExpenseRepositoryImpl implements IExpenseRepository {

        public void save(Expense exp) {
        }
    }
}
