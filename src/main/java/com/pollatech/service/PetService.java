package com.pollatech.service;

import java.util.Set;

import com.pollatech.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
