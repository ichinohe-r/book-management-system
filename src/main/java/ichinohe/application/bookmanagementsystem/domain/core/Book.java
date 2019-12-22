package ichinohe.application.bookmanagementsystem.domain.core;

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

    private final Publisher publisher;
}
