package com.example;

import java.util.List;
import java.util.Objects;

public class BookService  {
    private final BookRepository bookRepository;

    

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(Book book) {
        Objects.requireNonNull(book, "Book cannot null");
        this.bookRepository.save(book);
    }

    public Book getBookById(int id) {
        return this.bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public void deleteBook(int id) {
        this.bookRepository.deleteById(id);
    }

}
