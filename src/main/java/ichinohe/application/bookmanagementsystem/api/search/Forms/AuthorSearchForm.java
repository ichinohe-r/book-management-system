package ichinohe.application.bookmanagementsystem.api.search.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class AuthorSearchForm {
    @Getter
    private final String value;

    public Author getValueObject() {
        return new Author(this.value);
    }
}
