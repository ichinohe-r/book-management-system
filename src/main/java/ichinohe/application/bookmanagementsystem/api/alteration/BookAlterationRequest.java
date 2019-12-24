package ichinohe.application.bookmanagementsystem.api.alteration;

import ichinohe.application.bookmanagementsystem.api.alteration.Forms.AuthorAlterationForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.BookManagementNumberAlterationForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.BookTitleAlterationForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.PublisherAlterationForm;
import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.core.UpdateDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookAlterationRequest {
    private final int bookManagementNumberAlterationForm;

    private final AuthorAlterationForm authorAlterationForm;

    private final BookTitleAlterationForm bookTitleAlterationForm;

    private final PublisherAlterationForm publisherAlterationForm;

    public BookAlterationApplication createApplication() {
        return new BookAlterationApplication(
                new BookManagementNumber(this.bookManagementNumberAlterationForm),
                authorAlterationForm.getValueObject(),
                bookTitleAlterationForm.getValueObject(),
                publisherAlterationForm.getValueObject(),
                UpdateDateTime.create()
        );
    }
}
