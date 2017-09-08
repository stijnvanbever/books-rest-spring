package be.stijn.books.booksrestspring.model;

public class Book {
    private final long id;
    private final String title;
    private final String author;

    public Book(long id, String name, String author) {
        this.id = id;
        this.title = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
