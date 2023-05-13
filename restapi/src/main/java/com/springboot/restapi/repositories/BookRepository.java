package com.springboot.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.entities.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
