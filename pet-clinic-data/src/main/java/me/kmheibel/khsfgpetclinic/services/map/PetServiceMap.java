package me.kmheibel.khsfgpetclinic.services.map;

import me.kmheibel.khsfgpetclinic.model.Pet;
import me.kmheibel.khsfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByValue(Pet pet) {
        super.deleteByValue(pet);
    }
}
