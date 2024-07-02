package com.cjc.service;

import java.util.List;

import com.cjc.model.Tutor;

public interface TutorService {

	Tutor savetutor(Tutor tutor);

	Tutor getSingleData(int id);

	List<Tutor> getAllData();

	Tutor deleteTutor(int tutor);

	List<Tutor> findByTlocation(String tlocation);

}
