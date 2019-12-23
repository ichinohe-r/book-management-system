package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Entity >> 書籍
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookEntity {
    @Getter
    private final BookManagementNumber bookManagementNumber;
    @Getter
    private final Author author;
    @Getter
    private final BookTitle bookTitle;
    @Getter
    private final Publisher publisher;
}
