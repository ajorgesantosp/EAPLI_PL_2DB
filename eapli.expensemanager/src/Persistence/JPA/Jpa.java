/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Classe para guardar em persistencia
 *
 * @autor 1110186 & 1110590
 */

public class Jpa<T, PK extends Serializable> implements IJpaDataAccessObject<T, PK>{

    List<Expense> t = new ArrayList<Expense>();
    
    protected Class<T> entityClass;
    protected EntityManager entityManager;
    
    public Jpa(){
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
    
    @Override
    public T create(T t) {
        this.entityManager.persist(t);
        return t;
    }

    @Override
    public T read(PK id) {
       return this.entityManager.find(entityClass, id);
    }

    @Override
    public T update(T t) {
        return this.entityManager.merge(t);
    }

    @Override
    public void delete(T t) {
       t = this.entityManager.merge(t);
       this.entityManager.remove(t);
    }
    
}
