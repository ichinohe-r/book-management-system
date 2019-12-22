package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> フォームに入力された国際標準図書番号の内容
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class PublisherForm {
    @Getter
    private final String value;

    public Publisher getValueObject() {
        return new Publisher(value);
    }
}
