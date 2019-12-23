package ichinohe.application.bookmanagementsystem.api.search.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class PublisherSearchForm {
    @Getter
    private final String value;

    public Publisher getValueObject() {
        return new Publisher(value);
    }
}
