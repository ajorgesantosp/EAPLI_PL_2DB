/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
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
public class IExpenseTypeRepositoryTest {
    
    public IExpenseTypeRepositoryTest() {
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
     * Test of save method, of class IExpenseTypeRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        ExpenseType expType = null;
        IExpenseTypeRepository instance = new IExpenseTypeRepositoryImpl();
        instance.save(expType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IExpenseTypeRepositoryImpl implements IExpenseTypeRepository {

        public void save(ExpenseType expType) {
        }
    }
}
