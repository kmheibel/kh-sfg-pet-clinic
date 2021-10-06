package me.kmheibel.khsfgpetclinic.services;

import me.kmheibel.khsfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    void save(Vet pet);

    Set<Vet> findAll();
}
