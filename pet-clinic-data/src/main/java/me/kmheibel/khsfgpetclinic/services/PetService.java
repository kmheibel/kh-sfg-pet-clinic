package me.kmheibel.khsfgpetclinic.services;

import me.kmheibel.khsfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
