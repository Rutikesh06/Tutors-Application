package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Tutor;
import com.cjc.service.TutorService;

@RestController
@RequestMapping("/")
public class TutorsController {

	@Autowired
	private TutorService tservice;


	@PostMapping("/tutors")
	public ResponseEntity<Tutor> saveAdmin(@RequestBody Tutor tutor) {

		return new ResponseEntity<Tutor>(tservice.savetutor(tutor), HttpStatus.CREATED);
	}

	@GetMapping("/tutors/{id}")
	public ResponseEntity<Tutor> getSingleData(@PathVariable int id) {
		return new ResponseEntity<Tutor>(tservice.getSingleData(id), HttpStatus.OK);
	}

	@GetMapping("/tutors")
	public ResponseEntity<List<Tutor>> gatAllDeta() {
		return new ResponseEntity<List<Tutor>>(tservice.getAllData(), HttpStatus.OK);
	}

	@PutMapping("/tutor/{id}")
	public ResponseEntity<Tutor> updateTutor(@RequestBody Tutor tutor) {
		return new ResponseEntity<Tutor>(tservice.savetutor(tutor), HttpStatus.CREATED);
	}

	@DeleteMapping("/{tutors}")
	public ResponseEntity<Tutor> deleteTutor(@PathVariable int tutor)

	{
		return new ResponseEntity<Tutor>(tservice.deleteTutor(tutor), HttpStatus.OK);
	}
	
	@GetMapping("/tutors/tlocation/{tlocation}")
	public ResponseEntity<List<Tutor>> findByName(@PathVariable String tlocation)
	{
		return new ResponseEntity<List<Tutor>> (tservice.findByTlocation(tlocation),HttpStatus.OK);
	}
}
