package Persistence;

import Main.ExpenseManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fabrica para persistencia
 *
 * @autor 1110186 & 1110590
 */
public class PersistenceFactory {

    private PersistenceFactory() {
    }
    
    public static RepositoryFactory buildPersistenceFactory(){
        
        String factoryClassName = ExpenseManager.getApplicationProperties().getProperty("persistence.repositoryFactory");
        
        System.out.println(factoryClassName);
        
        try{
            return (RepositoryFactory) Class.forName(factoryClassName).newInstance();
        }catch (ClassNotFoundException ex){
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (InstantiationException ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       
    }
}
