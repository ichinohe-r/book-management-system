package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 国際標準図書番号Form {
    @Getter
    private final String value;

    public 国際標準図書番号 getValueObject(){
        return new 国際標準図書番号(value);
    }
}
