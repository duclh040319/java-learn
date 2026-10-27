package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class  BookRepository {
    private final Map<Integer, Book> books = new HashMap<>();
    
    public void save(Book book) {
        books.put(book.getId(), book);
    }

    public Book findById(int id) {
        return books.get(id);
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public void deleteById(int id) {
        books.remove(id);
    }
}
