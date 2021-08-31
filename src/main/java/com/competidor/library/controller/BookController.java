package com.competidor.library.controller;

import com.competidor.library.model.Book;
import com.competidor.library.repository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRespository respository;

    @PostMapping()
    public String saveBook(@RequestBody Book book){
        respository.save(book);
        return "insert book: "+ book.getId() + "-" + book.getName();
    }

    @GetMapping()
    public List<Book> getBooks(){
        List<Book> bookList = respository.findAll();
        return bookList;
    }

}
