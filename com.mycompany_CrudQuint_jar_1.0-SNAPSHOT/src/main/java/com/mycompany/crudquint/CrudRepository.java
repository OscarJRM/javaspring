package com.mycompany.crudquint;


import java.util.List;

/**
 *
 * @author ramir
 */
public interface CrudRepository<T> {
    List<T> getAll();
    boolean create(T entity);
    boolean update(T entity);
    boolean delete(String ID);
    
}
