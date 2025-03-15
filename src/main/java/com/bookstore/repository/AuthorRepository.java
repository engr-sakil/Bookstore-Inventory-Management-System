package com.bookstore.repository;

import com.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AuthorRepository extends JpaRepository<Author, Serializable> {
}
