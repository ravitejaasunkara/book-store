package com.springboot.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.entities.Book;
import com.springboot.restapi.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> getAllBooksData() {
		return repository.findAll();
	}

	public Optional<Book> getSingleBookById(int id) {
		Optional<Book> book = repository.findById(id);
		if(book.isEmpty())
			throw new Error("no book found with id "+id);
		return book;
	}

	public void deleteBookById(int id) {
		repository.deleteById(id);
	}

	public void saveNewBook(Book book) {
		repository.save(book);
	}

}
