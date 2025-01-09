package com.learning.amanda.model.dtos;

import com.learning.amanda.model.entities.Author;
import com.learning.amanda.model.entities.Publisher;
import com.learning.amanda.model.entities.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class BookDTO {
    private String title;
    private Long publisherId;
    private Set<Long> authorsIds;
    private String review;
}
