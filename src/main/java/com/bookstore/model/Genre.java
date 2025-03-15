package com.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "genre_details")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private int id;
    @Column(name = "genre_name")
    private String name;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "genre_id")
    private List<Book> book;
}
