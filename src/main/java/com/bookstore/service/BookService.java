package com.bookstore.service;


import com.bookstore.model.Book;


import java.util.List;

public interface BookService {
    public String upsert(Book book_details);

    public Book getById(int book_id);

    public List<Book> getAllBooks();

    public String deleteById(int book_id);
}
