package com.bookstore.service;

import com.bookstore.model.Author;
import com.bookstore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImplement implements AuthorService{

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public String upsert(Author author) {
        authorRepo.save(author);
        return "Success";
    }

    @Override
    public Author getById(int author_id) {
        Optional<Author> findById = authorRepo.findById(author_id);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepo.findAll();
    }

    @Override
    public String deleteById(int author_id) {
        if(authorRepo.existsById(author_id)){
            authorRepo.deleteById(author_id);
            return "Deleted";
        }else{
            return "Record Not Found";
        }
    }
}
