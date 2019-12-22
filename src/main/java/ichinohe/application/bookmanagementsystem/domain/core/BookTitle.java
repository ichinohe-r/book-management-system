package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> 書籍名
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookTitle {
    @Getter
    private final String value;
}
