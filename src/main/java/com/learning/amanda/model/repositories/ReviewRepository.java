package com.learning.amanda.model.repositories;

import com.learning.amanda.model.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
