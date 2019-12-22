package ichinohe.application.bookmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> 書籍管理番号
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookManagementNumber {
    @Getter
    private final Integer value;
}
