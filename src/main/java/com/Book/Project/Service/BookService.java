package com.Book.Project.Service;

import com.Book.Project.Entities.Book;
import com.Book.Project.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

@Autowired
private BookRepository bookRepository;



    public Book save(Book book) {
        return bookRepository.save(book);
    }


    public List<Book> findAll() {
        return  bookRepository.findAll();
    }


    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
          bookRepository.deleteById(id);
    }

    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
