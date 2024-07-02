package com.cjc.service;

import java.util.List;

import com.cjc.model.Books;

public interface BooksService {

	Books saveBook(Books book);

	Books getSingleBook(int id);

	List<Books> getAllBooks();

	Books deleteBook(int id);

}
