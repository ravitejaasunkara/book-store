package com.springboot.restapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entities.Book;
import com.springboot.restapi.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(path = "/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooksData();
	}
	
	@GetMapping(path = "/books/{id}")
	public Optional<Book> getSingleBook(@PathVariable int id) {
		return bookService.getSingleBookById(id);
	}
	
	@PostMapping(path = "/books")
	public void saveBook(@RequestBody Book book) {
		bookService.saveNewBook(book);
	}
	
	@DeleteMapping(path = "/books/{id}")
	public void deleteBook(@PathVariable int id) {
		bookService.deleteBookById(id);
	}
}
