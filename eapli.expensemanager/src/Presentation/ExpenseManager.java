/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.RecordExpense;
import Presentation.MainMenu;
import eapli.util.Math;
import Persistence.*;
import eapli.bootstrap.ExpenseBootstrapper;
import eapli.exception.EmptyList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PersistenceFactory per=PersistenceFactory.getInstance();
        
        ExpenseBootstrapper eb= new ExpenseBootstrapper();
        RecordExpense re=new RecordExpense();
        try {
            re.loadRepository();
        } catch (EmptyList ex) {
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
        MainMenu menu = new MainMenu();
        menu.doShow();
    }
}
