package com.pollatech.service;

import java.util.Set;

import com.pollatech.model.Vet;

public interface VetService extends CrudService<Vet , Long> {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
	
}
