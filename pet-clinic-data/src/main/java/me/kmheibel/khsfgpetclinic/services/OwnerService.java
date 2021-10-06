package me.kmheibel.khsfgpetclinic.services;

import me.kmheibel.khsfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
