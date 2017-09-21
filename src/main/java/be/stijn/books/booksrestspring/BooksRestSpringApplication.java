package be.stijn.books.booksrestspring;

import be.stijn.books.booksrestspring.model.Book;
import be.stijn.books.booksrestspring.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksRestSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksRestSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner setup(BookRepository bookRepository) {
        return (arg) -> {
            bookRepository.save(new Book("Harry Potter", "J.K.Rowling"));
            bookRepository.save(new Book("Mistborn", "Brandon Sanderson"));
        };
    }
}
