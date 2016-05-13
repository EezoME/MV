package com.mv.dao.interfaces;

import java.io.Serializable;

/**
 *
 * Created by Eezo on 13.05.2016.
 */
public interface GenericDao<T extends Serializable> {

    void persist(T entity);

    void merge(T entity);

    void remove(T entity);

    void remove(Object id);

    T find(Object id);
}