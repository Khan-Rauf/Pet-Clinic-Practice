package com.pollatech.service.mapping;

import java.util.Set;

import com.pollatech.model.Owner;
import com.pollatech.service.CrudService;

public class OwnerServiceMap implements CrudService<Owner,Long> {

	@Override
	public Owner findById(Long id) {
		 return this.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return this.save(object);
	}

	@Override
	public Set<Owner> findAll() {
		return this.findAll();
	}
	@Override
	public void delete(Owner object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

	


	
	
}
