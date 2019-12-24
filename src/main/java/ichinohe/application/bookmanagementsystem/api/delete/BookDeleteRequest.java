package ichinohe.application.bookmanagementsystem.api.delete;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.Pattern;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookDeleteRequest {

    @Pattern(regexp = "^[0-9]*$")
    private final int bookManagementNumberForm;

    public BookDeleteApplication createApplication() {
        return new BookDeleteApplication(
                new BookManagementNumber(this.bookManagementNumberForm)
        );
    }
}
