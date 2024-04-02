package com.nagarro.Assignment_5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Assignment_5.dao.BookRepository;
import com.nagarro.Assignment_5.entity.Book;
import com.nagarro.Assignment_5.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	
	@PostMapping("/Books")
	public Book addBook(Book book) {
		bookservice.saveBook(book);
		return book;
	}

	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {

		bookservice.deleteBook(id);
		return "deleted";

	}

	@GetMapping("/Books")

	public List<Book> getBooks() {
		return bookservice.findAllBooks();

	}

	@PutMapping("/updateBooks")
	public Book updateBook(Book book) {
		bookservice.updateBook(book);
		return book;
	}
	

}
