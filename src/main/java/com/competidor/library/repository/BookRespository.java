package com.competidor.library.repository;

import com.competidor.library.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRespository extends MongoRepository<Book, Integer> {
}
