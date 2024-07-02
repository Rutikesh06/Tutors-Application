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
import com.cjc.service.BooksService;

@RestController
@RequestMapping("/")
public class BooksController {
	@Autowired
	private BooksService bservice;



	@PostMapping("/books")
	public ResponseEntity<Books> saveBook(@RequestBody Books book) {
		return new ResponseEntity<Books>(bservice.saveBook(book), HttpStatus.OK);

	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Books> getSingleBook(@PathVariable int id) {
		return new ResponseEntity<Books>(bservice.getSingleBook(id), HttpStatus.OK);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Books>> getAllBooks() {
		return new ResponseEntity<List<Books>>(bservice.getAllBooks(), HttpStatus.OK);
	}

	@PutMapping("/book")
	public ResponseEntity<Books> updateBook(@RequestBody Books book) {
		return new ResponseEntity<Books>(bservice.saveBook(book), HttpStatus.OK);
	}

	@DeleteMapping("/books{id}")
	public ResponseEntity<Books> deleteBook(@PathVariable int id) {
		return new ResponseEntity<Books>(bservice.deleteBook(id), HttpStatus.OK);
	}
}
