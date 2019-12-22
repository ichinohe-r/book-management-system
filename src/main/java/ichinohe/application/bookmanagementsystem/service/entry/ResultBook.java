package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.entry.Author;
import ichinohe.application.bookmanagementsystem.domain.entry.Book;
import ichinohe.application.bookmanagementsystem.domain.entry.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.entry.InternationalStandardBookNumber;
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
    private final String isbn;

    public Book restore(ResultBook resultBook){
        return new Book(
                new Author(resultBook.author),
                new BookTitle(resultBook.book_title),
                new InternationalStandardBookNumber(resultBook.isbn)
        );
    }
}
