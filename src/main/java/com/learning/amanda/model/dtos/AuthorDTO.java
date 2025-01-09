package com.learning.amanda.model.dtos;

import com.learning.amanda.model.entities.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO {
    private Long id;
    private String name;
    private Set<Book> books;
}

