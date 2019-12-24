package ichinohe.application.bookmanagementsystem.api.alteration.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookManagementNumberAlterationForm {
    @Getter
    private final int value;

    public BookManagementNumber getValueObject() {
        return new BookManagementNumber(this.value);
    }
}
