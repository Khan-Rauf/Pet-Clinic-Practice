package com.pollatech.service.mapping;

import java.util.Set;

import com.pollatech.model.Vet;
import com.pollatech.service.CrudService;

public class VetServiceMap implements CrudService<Vet , Long>{

	@Override
	public Vet findById(Long id) {
		 return this.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return this.save(object);
	}

	@Override
	public Set<Vet> findAll() {
		return this.findAll();
	}
	@Override
	public void delete(Vet object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

	
}
