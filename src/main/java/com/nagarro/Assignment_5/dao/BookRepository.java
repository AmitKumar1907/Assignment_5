package com.nagarro.Assignment_5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.nagarro.Assignment_5.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{


}
