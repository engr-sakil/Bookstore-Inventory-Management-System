package com.bookstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="book_details")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @Column(name = "author_id")
    private int authorId;

    @ManyToOne
    @JoinColumn(name = "author_id", insertable = false, updatable = false)
    private Author author;

    @Column(name = "genre_id")
    private int genreId;

    @ManyToOne
    @JoinColumn(name = "genre_id",insertable = false,updatable = false)
    private Genre genre;

    private double price;
    private int quantity;

}
