package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * << Entity >> 書籍
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookEntity {
    private final BookManagementNumber bookManagementNumber;

    private final Author author;

    private final BookTitle bookTitle;

    private final Publisher publisher;
}
