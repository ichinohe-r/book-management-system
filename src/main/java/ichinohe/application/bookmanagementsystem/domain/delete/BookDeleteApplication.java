package ichinohe.application.bookmanagementsystem.domain.delete;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookDeleteApplication {
    @Getter
    private final BookManagementNumber bookManagementNumber;

    public int getBookManagementNumberIntValue(){
        return bookManagementNumber.getIntValue();
    }
}
