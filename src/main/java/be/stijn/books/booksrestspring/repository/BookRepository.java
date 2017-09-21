package be.stijn.books.booksrestspring.repository;

import be.stijn.books.booksrestspring.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
