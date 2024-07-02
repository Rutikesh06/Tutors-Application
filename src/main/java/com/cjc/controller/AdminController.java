package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Admin;
import com.cjc.model.Books;
import com.cjc.model.Tutor;
import com.cjc.service.AdminService;
import com.cjc.service.BooksService;
import com.cjc.service.TutorService;

@RestController
@RequestMapping("/")

public class AdminController {

	@Autowired
	private AdminService aservice;
	@Autowired
	private TutorService tservice;
	@Autowired
	private BooksService bservice;

	@PostMapping("/admins")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {

		return new ResponseEntity<Admin>(aservice.saveadmin(admin), HttpStatus.CREATED);
	}

	@GetMapping("/admins/tutors")
	public ResponseEntity<List<Tutor>> getTutor() {
		return new ResponseEntity<List<Tutor>>(tservice.getAllData(), HttpStatus.OK);
	}

	@PostMapping("/admins/tutors")
	public ResponseEntity<Tutor> saveAdmin(@RequestBody Tutor tutor) {

		return new ResponseEntity<Tutor>(tservice.savetutor(tutor), HttpStatus.CREATED);
	}

	@PostMapping("/admins/books")
	public ResponseEntity<Books> saveBook(@RequestBody Books book) {
		return new ResponseEntity<Books>(bservice.saveBook(book), HttpStatus.OK);

	}
}
