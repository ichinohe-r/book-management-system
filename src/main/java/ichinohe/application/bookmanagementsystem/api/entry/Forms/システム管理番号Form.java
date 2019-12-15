package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class システム管理番号Form {
    @Getter
    public final String value;
}
