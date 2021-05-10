package com.pollatech.service;

import java.util.Set;

import com.pollatech.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll(); 	
	
}
