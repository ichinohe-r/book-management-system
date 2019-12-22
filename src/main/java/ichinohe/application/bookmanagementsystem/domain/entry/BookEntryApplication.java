package ichinohe.application.bookmanagementsystem.domain.entry;

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
    private final InternationalStandardBookNumber isbn;
    @Getter
    private final ReceiptDateTime receptionDateAndTime;

    public Book createApplicationBook() {
        return new Book(
                new Author(author.getValue()),
                new BookTitle(bookTitle.getValue()),
                new InternationalStandardBookNumber(isbn.getValue()));
    }
}
