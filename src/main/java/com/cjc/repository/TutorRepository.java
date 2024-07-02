package com.cjc.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Integer>{

	 List<Tutor> findByTlocationStartingWith(String tlocation); 

	
}
