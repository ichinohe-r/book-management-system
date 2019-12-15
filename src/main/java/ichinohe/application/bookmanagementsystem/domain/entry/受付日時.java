package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class 受付日時 {
    @Getter
    private final LocalDateTime value;

    public static 受付日時 create() {
        return new 受付日時(LocalDateTime.now());
    }
}
