package ichinohe.application.bookmanagementsystem.api.search.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookTitleSearchForm {
    @Getter
    private final String value;

    public BookTitle getValueObject() {
        return new BookTitle(value);
    }
}
