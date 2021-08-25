package com.barclay.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclay.bank.entity.Book;
import com.barclay.bank.service.BookService;

@RestController
public class BookController {

	
	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
		
	}

	@GetMapping(value = "/books",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> findAllBooks() {
		final List<Book> books = bookService.findAllBooks();

		return books;
	}

	@GetMapping("/book/{name}")
	public Book findBookByName(@PathVariable("name") String name) {
		final Book book = bookService.findBookByName(name);
		return book;
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void showCreateForm(@RequestBody Book book) {
		bookService.createBook(book);
	}

}