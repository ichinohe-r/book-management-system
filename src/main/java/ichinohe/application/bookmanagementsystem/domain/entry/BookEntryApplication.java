package ichinohe.application.bookmanagementsystem.domain.entry;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.Book;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import ichinohe.application.bookmanagementsystem.domain.core.ReceiptDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * 書籍登録申込書
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookEntryApplication {
    @Getter
    private final Author author;
    @Getter
    private final BookTitle bookTitle;
    @Getter
    private final Publisher publisher;
    @Getter
    private final ReceiptDateTime receptionDateAndTime;

    public Book createApplicationBook() {
        return new Book(
                new Author(author.getValue()),
                new BookTitle(bookTitle.getValue()),
                new Publisher(publisher.getValue()));
    }
}
