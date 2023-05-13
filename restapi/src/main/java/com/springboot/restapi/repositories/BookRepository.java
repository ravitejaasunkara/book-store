package com.springboot.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
