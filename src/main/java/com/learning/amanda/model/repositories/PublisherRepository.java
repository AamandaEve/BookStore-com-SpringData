package com.learning.amanda.model.repositories;

import com.learning.amanda.model.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
