package com.bookstore.service;

import com.bookstore.model.Author;

import java.util.List;

public interface AuthorService {

    public String upsert(Author author);

    public Author getById(int author_id);

    public List<Author> getAllAuthor();

    public String deleteById(int author_id);

}
