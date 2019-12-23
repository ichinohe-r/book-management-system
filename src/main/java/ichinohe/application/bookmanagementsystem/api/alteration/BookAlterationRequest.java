package ichinohe.application.bookmanagementsystem.api.alteration;

import ichinohe.application.bookmanagementsystem.api.alteration.Forms.AuthorAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.BookManagementNumberAlterationForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.BookTitleAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.PublisherAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.UpdateDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookAlterationRequest {
    private final BookManagementNumberAlterationForm bookManagementNumberAlterationForm;

    private final AuthorAlterationSearchForm authorAlterationSearchForm;

    private final BookTitleAlterationSearchForm bookTitleAlterationSearchForm;

    private final PublisherAlterationSearchForm publisherAlterationSearchForm;

    public BookAlterationApplication createApplication() {
        return new BookAlterationApplication(
                bookManagementNumberAlterationForm.getValueObject(),
                authorAlterationSearchForm.getValueObject(),
                bookTitleAlterationSearchForm.getValueObject(),
                publisherAlterationSearchForm.getValueObject(),
                UpdateDateTime.create()
        );
    }
}
