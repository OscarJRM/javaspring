/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.estudiocrudspring;

import java.util.List;

/**
 *
 * @author ramir
 */
public interface CrudRepository<T> {
    List<T> getTransacciones(T entity);
    List<T> getTransacciones2(T entity,String cuenta, String fecIni, String fecFin);
    
    
}
