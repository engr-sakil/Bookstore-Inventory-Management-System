package com.bookstore.service;

import com.bookstore.model.Genre;
import com.bookstore.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImplement implements GenreService{
    @Autowired
    private GenreRepository genreRepo;

    @Override
    public String upsert(Genre genre) {
        genreRepo.save(genre);
        return "Success";
    }

    @Override
    public Genre getById(int genre_id) {
        Optional<Genre> findById = genreRepo.findById(genre_id);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Genre> getAllGenre() {
        return genreRepo.findAll();
    }

    @Override
    public String deleteById(int genre_id) {
        if(genreRepo.existsById(genre_id)){
            genreRepo.deleteById(genre_id);
            return "Deleted";
        }else{
            return "Record not Found";
        }
    }
}
