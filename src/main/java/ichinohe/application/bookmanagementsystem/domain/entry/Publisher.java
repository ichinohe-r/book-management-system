package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> 発行元
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Publisher {
    @Getter
    private final String value;
}
