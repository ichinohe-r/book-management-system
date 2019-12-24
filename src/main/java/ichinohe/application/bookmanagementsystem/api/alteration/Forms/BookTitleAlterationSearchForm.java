package ichinohe.application.bookmanagementsystem.api.alteration.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookTitleAlterationSearchForm {
    @Getter
    private final String value;

    public BookTitle getValueObject() {
        return new BookTitle(this.value);
    }
}
