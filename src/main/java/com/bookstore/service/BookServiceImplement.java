package com.bookstore.service;

import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.Book;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImplement implements BookService {
    @Autowired
    private BookRepository bookRepo;
    @Override
    public String upsert(Book book_details) {
        bookRepo.save(book_details); //insert and update based on PK
        return "Success";
    }

    @Override
    public Book getById(int book_id) {
        Optional<Book> findById = bookRepo.findById(book_id);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public String deleteById(int book_id) {
        if(bookRepo.existsById(book_id)){
            bookRepo.deleteById(book_id);
            return "Deleted";
        }else{
            return "No Record Found";
        }
    }
}
