package edu.springframework.zdppetclinic.services;

import java.util.Set;

/**
 * CREATE/READ/UPDATE/DELETE
 * POST/GET/PUT/DELETE
 *
 * Abstract Methods that will be required for our POJOs data
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
