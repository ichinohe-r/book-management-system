package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * << Value Object >> 更新日時
 */
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class UpdateDateTime {
    @Getter
    private final LocalDateTime value;

    public static UpdateDateTime create() {
        return new UpdateDateTime(LocalDateTime.now());
    }
}
