package com.example.integrador.controllers.book;

import com.example.integrador.model.Book;
import com.example.integrador.service.IBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }


    @GetMapping("/")
    public List<Book> findAllBook(){
        return iBookService.findAllBook();
    }

    @PostMapping("/")
    public Book createBook(@RequestBody Book book){
        return iBookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> findByIdBook(@PathVariable String id){
        return iBookService.findByIdBook(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id){
        iBookService.deleteBook(id);
    }

    @PutMapping("/")
    public Book updateBook(@RequestBody Book book){
        return iBookService.updateBook(book);
    }

}
