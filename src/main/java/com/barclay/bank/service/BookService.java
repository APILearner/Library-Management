package com.barclay.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.barclay.bank.entity.Book;
import com.barclay.bank.repository.BookServiceRepository;
@Service
public class BookService {

	private BookServiceRepository bookServiceRepository;
	
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Book> findAllBooks() {
		return bookServiceRepository.findAll();
	}
	
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Book findBookByName(String name) {
		return bookServiceRepository.findBookByName(name);
	}

	public void createBook(Book book) {
		bookServiceRepository.save(book);
	}

}
