package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 国際標準図書番号 {
    @Getter
    private final String value;
}
