package ichinohe.application.bookmanagementsystem.datasource.core;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class ResultBookEntity {
    @Getter
    private final int book_management_number;
    @Getter
    private final String author;
    @Getter
    private final String book_title;
    @Getter
    private final String publisher;

    public BookEntity restore() {
        return new BookEntity(
                new BookManagementNumber(this.book_management_number),
                new Author(this.author),
                new BookTitle(this.book_title),
                new Publisher(this.publisher)
        );
    }
}
