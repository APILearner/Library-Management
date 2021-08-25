package com.barclay.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book")
public class Book {
@Id
	private Long bookId;

private String name;

public Long getBookId() {
	return bookId;
}

public void setBookId(Long bookId) {
	this.bookId = bookId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
