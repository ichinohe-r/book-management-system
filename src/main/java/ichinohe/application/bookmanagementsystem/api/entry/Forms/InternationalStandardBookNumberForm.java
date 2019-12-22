package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.InternationalStandardBookNumber;
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
public class InternationalStandardBookNumberForm {
    @Getter
    private final String value;

    public InternationalStandardBookNumber getValueObject(){
        return new InternationalStandardBookNumber(value);
    }
}
