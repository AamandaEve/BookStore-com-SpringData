package com.learning.amanda.services;

import com.learning.amanda.model.dtos.BookDTO;
import com.learning.amanda.model.dtos.PublisherDTO;
import com.learning.amanda.model.entities.Book;
import com.learning.amanda.model.entities.Review;
import com.learning.amanda.model.repositories.AuthorRepository;
import com.learning.amanda.model.repositories.BookRepository;
import com.learning.amanda.model.repositories.PublisherRepository;
import com.learning.amanda.model.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final ReviewRepository reviewRepository;

    public BookService(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, ReviewRepository reviewRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.reviewRepository = reviewRepository;
    }

    public Book saveBook(BookDTO bookDto){
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setPublisher(publisherRepository.findById(bookDto.getPublisherId()).get());
        book.setAuthors(authorRepository.findAllById(bookDto.getAuthorsIds()).stream().collect(Collectors.toSet()));

        Review review = new Review();
        review.setBook(book);
        review.setComment(bookDto.getReview());
        book.setReview(review);
        return bookRepository.save(book);
    }
}
