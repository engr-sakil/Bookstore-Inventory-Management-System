package com.bookstore.restController;

import com.bookstore.model.Genre;
import com.bookstore.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/api")
public class GenreRestController {

    @Autowired
    private GenreService genreService;

    @PostMapping("/genre")
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre){
        String responseStatus = genreService.upsert(genre);
        return new ResponseEntity<>(genre, HttpStatus.CREATED);
    }

    @GetMapping("/all-genre")
    public ResponseEntity<List<Genre>> getAllGenre(){
        List<Genre> allGenre = genreService.getAllGenre();
        return new ResponseEntity<>(allGenre, HttpStatus.OK);
    }

    @GetMapping("/genre/{genre_id}")
    public ResponseEntity<Genre> getGenre(@PathVariable int genre_id){
        Genre genre = genreService.getById(genre_id);
        return new ResponseEntity<>(genre, HttpStatus.OK);
    }

    @PutMapping("/genre")
    public ResponseEntity<Genre> updateGenre(@RequestBody Genre genre){
        String responseStatus = genreService.upsert(genre);
        return new ResponseEntity<>(genre, HttpStatus.OK);
    }

    @DeleteMapping("/genre/{genre_id}")
    public ResponseEntity<String> deleteGenre(@PathVariable int genre_id){
        String responseStatus = genreService.deleteById(genre_id);
        return new ResponseEntity<>(responseStatus, HttpStatus.OK);
    }
}
