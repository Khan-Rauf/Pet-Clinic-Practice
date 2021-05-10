package com.pollatech.service.mapping;

import java.util.Set;

import com.pollatech.model.Pet;
import com.pollatech.service.CrudService;

public class PetServiceMap  implements CrudService<Pet , Long>{

	@Override
	public Pet findById(Long id) {
		 return this.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return this.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		return this.findAll();
	}
	@Override
	public void delete(Pet object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

	
	

}
