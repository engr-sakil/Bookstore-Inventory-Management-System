package com.bookstore.repository;

import com.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
