package com.competidor.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
public class Book {

    @Id
    private int id;

    @Field(name = "name")
    private String name;
    private String author;
    private String editorial;

    public Book() {
    }

    public Book(int id, String name, String author, String editorial) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
