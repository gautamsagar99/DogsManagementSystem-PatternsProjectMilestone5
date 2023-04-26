package com.gautamClasses.DMS.repositoy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gautamClasses.DMS.Models.Dog;

/**
 * 
 * @author Gautam Sagar Mallela
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
	
}
