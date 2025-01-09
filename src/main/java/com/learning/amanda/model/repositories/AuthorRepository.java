package com.learning.amanda.model.repositories;

import com.learning.amanda.model.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
