package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.書籍名;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 書籍名Form {
    @Getter
    private final String value;

    public 書籍名 getValueObject(){
        return new 書籍名(value);
    }
}
