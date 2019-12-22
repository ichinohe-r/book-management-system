package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * << 集合 Value Object >> 書籍
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class Book {
    private final Author author;
    private final BookTitle bookTitle;
    private final InternationalStandardBookNumber isbn;

//    public Book create() {
//        return new Book(
//                new Author(author.getValue()),
//                new BookTitle(bookTitle.getValue()),
//                new InternationalStandardBookNumber(isbn.getValue()));
//    }
}
