package be.stijn.books.booksrestspring.controller;

import be.stijn.books.booksrestspring.model.Book;
import be.stijn.books.booksrestspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @ResponseBody
    @GetMapping(value = "book")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @ResponseBody
    @PostMapping(value = "book")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @ResponseBody
    @DeleteMapping(value = "book/{id}")
    public void removeBook(@PathVariable(value = "id") Long id) { bookRepository.delete(id);}
}
