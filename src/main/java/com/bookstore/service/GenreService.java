package com.bookstore.service;

import com.bookstore.model.Genre;

import java.util.List;

public interface GenreService {
    public String upsert(Genre genre);
    public Genre getById(int genre_id);

    public List<Genre> getAllGenre();
    public String deleteById(int genre_id);
}
