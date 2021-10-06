package me.kmheibel.khsfgpetclinic.services;

import me.kmheibel.khsfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    void save(Owner owner);

    Set<Owner> findAll();
}
