package com.Book.Project.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

  //  @JsonProperty("author_name")
    @Column(name = "author_name")
    private String author_name;

    //@JsonProperty("book_name")
    @Column(name = "book_name")
    private String book_name;


    public Book setBookName(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public Book setAuthorName(String author_name) {
        this.author_name = author_name;
        return this;
    }


    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public void Book(Long id, String author_name , String book_name){

        this.id=id;
        this.author_name=author_name;
        this.book_name=book_name;
    }

    public Long getBookId(){
                                                    //  "authorName": null,
                                                    //    "bookName
        return id;
    }

    public String getBookName(){
        return book_name;
    }

    public String getAuthorName(){
        return author_name;
    }

}
