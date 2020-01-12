package ichinohe.application.bookmanagementsystem.domain.search;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookSearchApplication {
    @Getter
    private final Author author;
    @Getter
    private final BookTitle bookTitle;
    @Getter
    private final Publisher publisher;

    public String getAuthorStringValue() {
        return author.getStringValue();
    }

    public String getBookTitleStringValue() {
        return bookTitle.getStringValue();
    }

    public String getPublisherStringValue() {
        return publisher.getStringValue();
    }
}
