package com.nagarro.Assignment_5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Assignment_5.dao.BookRepository;
import com.nagarro.Assignment_5.entity.Book;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepo;

	public void saveBook(Book book) {
		bookRepo.save(book);

	}

	public void deleteBook(int id) {
		Book a = bookRepo.getOne(id);
		bookRepo.delete(a);

	}

	public List<Book> findAllBooks() {
		List<Book> allBooks = bookRepo.findAll();

		return allBooks;
	}

	public void updateBook(Book book) {
		bookRepo.save(book);

	}

}
