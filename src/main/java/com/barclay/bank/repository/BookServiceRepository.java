package com.barclay.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclay.bank.entity.Book;

@Repository
public interface BookServiceRepository extends JpaRepository<Book,Long> {

    Book findBookByName(String name);

    void createBook(Book book);
}
