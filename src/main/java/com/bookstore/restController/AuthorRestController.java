package com.bookstore.restController;

import com.bookstore.model.Author;
import com.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/api")
public class AuthorRestController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        String responseStatus = authorService.upsert(author);
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

    @GetMapping("/all-author")
    public ResponseEntity<List<Author>> getAllAuthor(){
        List<Author> allAuthor = authorService.getAllAuthor();
        return new ResponseEntity<>(allAuthor, HttpStatus.OK);
    }

    @GetMapping("/author/{author_id}")
    public ResponseEntity<Author> getAuthor(@PathVariable int author_id){
        Author author = authorService.getById(author_id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @PutMapping("/author")
    public ResponseEntity<Author> updateAuthor(@RequestBody Author author){
        String responseStatus = authorService.upsert(author);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @DeleteMapping("/author/{author_id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable int author_id){
        String  responseStatus = authorService.deleteById(author_id);
        return new ResponseEntity<>(responseStatus, HttpStatus.OK);
    }


}
