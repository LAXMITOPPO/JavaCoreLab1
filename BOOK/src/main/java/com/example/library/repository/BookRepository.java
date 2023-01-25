package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.library.Entity.Book;

@Repository

public interface BookRepository extends CrudRepository<Book, Integer> {

}
