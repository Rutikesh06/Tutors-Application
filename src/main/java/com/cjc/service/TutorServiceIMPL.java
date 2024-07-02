package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Tutor;
import com.cjc.repository.TutorRepository;

@Service
public class TutorServiceIMPL implements TutorService {
	@Autowired
	private TutorRepository trepo;

	@Override
	public Tutor savetutor(Tutor tutor) {

		return trepo.save(tutor);
	}

	@Override
	public Tutor getSingleData(int id) {

		return trepo.findById(id).get();
	}

	@Override
	public List<Tutor> getAllData() {

		return trepo.findAll();
	}

	@Override
	public Tutor deleteTutor(int tutor) {
		trepo.deleteById(tutor);
		return null;
	}



	@Override
	public List<Tutor> findByTlocation(String tlocation) {
	
		return trepo.findByTlocationStartingWith(tlocation);
	}
}
