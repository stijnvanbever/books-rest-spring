package be.stijn.books.booksrestspring.service;

import be.stijn.books.booksrestspring.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookService {

    private static List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book(1L, "Harry Potter", "J.K. Rowling"));
        books.add(new Book(2L, "Mistborn", "Brandon Sanderson"));
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
