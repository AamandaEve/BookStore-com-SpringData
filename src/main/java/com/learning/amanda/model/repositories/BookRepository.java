package com.learning.amanda.model.repositories;

import com.learning.amanda.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
