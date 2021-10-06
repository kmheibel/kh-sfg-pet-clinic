package me.kmheibel.khsfgpetclinic.services.map;

import me.kmheibel.khsfgpetclinic.model.Vet;
import me.kmheibel.khsfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void deleteByValue(Vet vet) {
        super.deleteByValue(vet);
    }
}
