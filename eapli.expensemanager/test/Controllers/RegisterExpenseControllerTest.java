/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.RecordExpense;
import eapli.exception.EmptyList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @autor 1110186 & 1110590
 */
public class RegisterExpenseControllerTest {

    private static RecordExpense repo;

    public RegisterExpenseControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        //Inicializar repositorio
        System.out.println("...Iniciar Testes...");
        repo = new RecordExpense();
    }

    @Before
    public void setUp() {
    }

    /**
     * Teste verificar lista ExpenseType vazia
     *
     * @exception exception EmptyList
     */
    @Test(expected = eapli.exception.EmptyList.class)
    public void testGetExpenseTypeException() throws EmptyList {
        System.out.println("getExpenseType - Exception EmptyList");
        RegisterExpenseController controller = new RegisterExpenseController();
        controller.getExpenseType();
    }

    /**
     * Teste verificar lista PaymentMean vazia
     *
     * @exception exception EmptyList
     */
    @Test(expected = eapli.exception.EmptyList.class)
    public void testGetPaymentMeanException() throws EmptyList {
        System.out.println("getPaymentMean - Exception EmptyList");
        RegisterExpenseController controller = new RegisterExpenseController();
        controller.getPaymentMean();
    }

    @After
    public void tearDown() {
        //É necessário limpar o repositorio
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("...Terminando Testes...");
    }
}
