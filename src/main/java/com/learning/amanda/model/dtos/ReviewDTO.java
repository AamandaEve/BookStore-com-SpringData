package com.learning.amanda.model.dtos;

import com.learning.amanda.model.entities.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReviewDTO {
    private String comment;
    private Book book;
}
