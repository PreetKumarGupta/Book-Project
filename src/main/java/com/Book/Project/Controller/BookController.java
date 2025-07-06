package com.Book.Project.Controller;

import com.Book.Project.Entities.Book;
import com.Book.Project.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//i will push this class
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @GetMapping
    public List<Book>  getAllBooks(){
        return bookService.findAll();
    }

    @PostMapping("/add")
    public Book  addBook(@RequestBody Book book){
        return bookService.save(book);
    }


    @PutMapping("/{id}")

    public Book updateBook(@PathVariable Long id,@RequestBody Book book){
        return bookService.save(book);
    }


    @DeleteMapping("/{id}")

    public void deleteBookById(@PathVariable Long id){
         bookService.deleteById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll(){
        bookService.deleteAll();
    }

}
