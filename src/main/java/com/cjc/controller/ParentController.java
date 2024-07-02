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

import com.cjc.model.Books;
import com.cjc.model.Parent;
import com.cjc.model.Tutor;
import com.cjc.service.BooksService;
import com.cjc.service.ParentService;
import com.cjc.service.TutorService;

@RestController
@RequestMapping("/")
public class ParentController {
	@Autowired
	private ParentService pservice;
	@Autowired
	private TutorService tservice;
	@Autowired
	private BooksService bservice;


	@PostMapping("/parents")
	public ResponseEntity<Parent> saveParent(@RequestBody Parent parent) {
		return new ResponseEntity<Parent>(pservice.saveParent(parent), HttpStatus.CREATED);
	}

	@GetMapping("/parents/{id}")
	public ResponseEntity<Parent> getSingleData(@PathVariable int id) {
		return new ResponseEntity<Parent>(pservice.getSingleData(id), HttpStatus.OK);
	}

	@GetMapping("/parents")
	public ResponseEntity<List<Parent>> getAllData() {
		return new ResponseEntity<List<Parent>>(pservice.getAllData(), HttpStatus.OK);
	}

	@PutMapping("/parents/{parent}")
	public ResponseEntity<Parent> updateParent(@RequestBody Parent parent) {
		return new ResponseEntity<Parent>(pservice.saveParent(parent), HttpStatus.OK);
	}

	@DeleteMapping("/parents/{parent}")
	public ResponseEntity<Parent> deleteParent(@PathVariable int parent)

	{
		return new ResponseEntity<Parent>(pservice.deleteParent(parent), HttpStatus.OK);
	}

	@GetMapping("/parents/tutors")
	public ResponseEntity<List<Tutor>> gatAllDeta() {
		return new ResponseEntity<List<Tutor>>(tservice.getAllData(), HttpStatus.OK);
	}

	@GetMapping("/parents/books")
	public ResponseEntity<List<Books>> getAllBooks() {
		return new ResponseEntity<List<Books>>(bservice.getAllBooks(), HttpStatus.OK);
	}
	
	/*
	 * @GetMapping("/parents/tlocation/{tlocation}") public
	 * ResponseEntity<List<Tutor>> findByTlocation(String tlocation) { return new
	 * ResponseEntity<List<Tutor>>
	 * (pservice.findByTlocation(tlocation),HttpStatus.OK); }
	 */

}
