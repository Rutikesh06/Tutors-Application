package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

}
