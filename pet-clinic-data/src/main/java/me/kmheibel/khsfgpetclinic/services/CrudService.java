package me.kmheibel.khsfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID id);

    Set<T> findAll();

    T save(T object);

    void deleteById(ID id);

    void deleteByValue(T object);
}
