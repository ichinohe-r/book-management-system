package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class ReceiptDateTime {
    @Getter
    private final LocalDateTime value;

    public static ReceiptDateTime create() {
        return new ReceiptDateTime(LocalDateTime.now());
    }
}
