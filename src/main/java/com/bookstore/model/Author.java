package com.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="author_details")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private int id;

    @Column(name = "author_name")
    private String name;


    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "author_id")
    private List<Book> book;
}
