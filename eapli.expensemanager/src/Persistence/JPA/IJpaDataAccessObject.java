/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import java.io.Serializable;

/**
 * Interface DAO
 *
 * @autor 1110186 & 1110590
 */

public interface IJpaDataAccessObject<T, PK extends Serializable>{
    
    T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
    
}
