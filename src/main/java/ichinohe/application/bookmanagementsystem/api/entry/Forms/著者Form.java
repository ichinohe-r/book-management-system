package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.著者;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 著者Form {
    @Getter
    private final String value;

    public 著者 getValueObject(){
        return new 著者(value);
    }
}
