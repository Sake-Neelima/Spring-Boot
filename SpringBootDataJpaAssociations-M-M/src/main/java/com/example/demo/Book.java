package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String author;
    private  Double price;
    @ManyToMany
    @JoinTable(name="Book_Author",joinColumns=@JoinColumn(name="bfk"),
    		inverseJoinColumns=@JoinColumn(name="afk"))
    private List<Author> Au;
}

