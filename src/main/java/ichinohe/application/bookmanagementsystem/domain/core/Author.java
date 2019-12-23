package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> 著者
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Author {
    @Getter
    private final String value;

    public String getStringValue() {
        return this.value;
    }
}
