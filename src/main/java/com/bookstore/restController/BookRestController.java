package com.bookstore.restController;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {
    @Autowired
    private BookService bookService;
    @PostMapping("/book")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        String responseStatus = bookService.upsert(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("/book/{book_id}")
    public ResponseEntity<Book> getBook(@PathVariable int book_id){
        Book book = bookService.getById(book_id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @GetMapping("/all-books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> allBooks = bookService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
        String updateStatus = bookService.upsert(book);
        return new ResponseEntity<>(updateStatus, HttpStatus.OK);
    }
    @DeleteMapping("/book/{book_id}")
    public ResponseEntity<String> deleteBook(@PathVariable int book_id){
        String deleteStatus = bookService.deleteById(book_id);
        return new ResponseEntity<>(deleteStatus, HttpStatus.OK);
    }

}
