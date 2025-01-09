package com.learning.amanda.model.dtos;

import com.learning.amanda.model.entities.Book;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PublisherDTO {
    private String name;
    private Set<Book> books;
}
