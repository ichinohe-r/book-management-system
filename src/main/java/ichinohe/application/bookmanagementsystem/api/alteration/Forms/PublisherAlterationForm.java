package ichinohe.application.bookmanagementsystem.api.alteration.Forms;

import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class PublisherAlterationForm {
    @Getter
    private final String value;

    public Publisher getValueObject() {
        return new Publisher(this.value);
    }
}
