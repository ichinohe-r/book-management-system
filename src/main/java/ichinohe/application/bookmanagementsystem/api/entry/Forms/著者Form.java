package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 著者Form {
    @Getter
    public final String value;
}
