package com.bookstore.repository;

import com.bookstore.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface GenreRepository extends JpaRepository<Genre, Serializable> {
}
