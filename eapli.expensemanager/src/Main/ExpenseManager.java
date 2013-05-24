/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.RecordExpense;
import Presentation.MainMenu;
import eapli.bootstrap.ExpenseBootstrapper;
import eapli.exception.EmptyList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {

    private static Properties applicationProperties = new Properties();

    public static void main(String[] args) {
        //PersistenceFactory per=PersistenceFactory.getInstance();

        loadProperties();

        ExpenseBootstrapper eb = new ExpenseBootstrapper();
        RecordExpense re = new RecordExpense();
        try {
            re.loadRepository();
        } catch (EmptyList ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        MainMenu menu = new MainMenu();
        menu.doShow();
    }

    public static Properties getApplicationProperties() {
        return applicationProperties;
    }

    private static void loadProperties() {
        FileInputStream propertiesStream = null;
        try {
            propertiesStream = new FileInputStream("./src/Main/expensemanager.properties");
            applicationProperties.load(propertiesStream);

        } catch (IOException ex) {

            applicationProperties.setProperty("persistence.repositoryFactory", "eapli.expensemanager.persistence.JpaRepositoryFactory");

            Logger.getLogger(ExpenseManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (propertiesStream != null) {
                try {
                    propertiesStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(ExpenseManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
