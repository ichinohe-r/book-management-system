package ichinohe.application.bookmanagementsystem.api.alteration.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class AuthorAlterationForm {
    @Getter
    private final String value;

    public Author getValueObject() {
        return new Author(this.value);
    }
}
