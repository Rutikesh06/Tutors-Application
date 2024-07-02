package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Books;
import com.cjc.repository.BooksRepository;

@Service
public class BooksServiceIMPL implements BooksService {
	@Autowired
	private BooksRepository brepo;

	@Override
	public Books saveBook(Books book) {

		return brepo.save(book);
	}

	@Override
	public Books getSingleBook(int id) {

		return brepo.findById(id).get();
	}

	@Override
	public List<Books> getAllBooks() {

		return brepo.findAll();
	}

	@Override
	public Books deleteBook(int id) {
		brepo.deleteById(id);
		return null;
	}

}
