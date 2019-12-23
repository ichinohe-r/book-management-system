package ichinohe.application.bookmanagementsystem.datasource.core;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.Book;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * DBから復元した書籍
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class ResultBook {
    private final String author;
    private final String book_title;
    private final String publisher;

    public Book restore(ResultBook resultBook) {
        return new Book(
                new Author(resultBook.author),
                new BookTitle(resultBook.book_title),
                new Publisher(resultBook.publisher)
        );
    }
}
