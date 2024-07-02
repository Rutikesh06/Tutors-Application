package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Parent;
import com.cjc.model.Tutor;
import com.cjc.repository.ParentRepository;
import com.cjc.repository.TutorRepository;

@Service
public class ParentServiceIMPL implements ParentService {
	@Autowired
	private ParentRepository prepo;
	@Autowired
	private TutorRepository trepo;

	@Override
	public Parent saveParent(Parent parent) {

		return prepo.save(parent);
	}

	@Override
	public Parent getSingleData(int id) {

		return prepo.findById(id).get();
	}

	@Override
	public List<Parent> getAllData() {

		return prepo.findAll();
	}

	@Override
	public Parent deleteParent(int parent) {
		prepo.deleteById(parent);
		return null;
	}

	/*
	 * public List<Tutor> findByTlocation(String tlocation) {
	 * 
	 * return trepo.findByTlocation(tlocation); }
	 */


}
