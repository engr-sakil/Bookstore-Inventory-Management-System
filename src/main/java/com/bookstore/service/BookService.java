package com.bookstore.service;


import com.bookstore.model.Book;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import java.util.List;

public interface BookService {
    public String upsert(Book book_details);

    public Book getById(int book_id);

    public List<Book> getAllBooks();

    public String deleteById(int book_id);

    public Page<Book> searchBooks(String title, String author, String genre, Pageable pageable);
}
