package com.example.integrador.repository;

import com.example.integrador.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IBookRepository extends MongoRepository<Book, String> {



}
