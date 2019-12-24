package ichinohe.application.bookmanagementsystem.api.alteration;

import ichinohe.application.bookmanagementsystem.api.alteration.Forms.AuthorAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.BookTitleAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.api.alteration.Forms.PublisherAlterationSearchForm;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookAlterationSearchRequest {
    private final AuthorAlterationSearchForm authorAlterationSearchForm;

    private final BookTitleAlterationSearchForm bookTitleAlterationSearchForm;

    private final PublisherAlterationSearchForm publisherAlterationSearchForm;

    public BookSearchApplication createApplication() {
        return new BookSearchApplication(
                authorAlterationSearchForm.getValueObject(),
                bookTitleAlterationSearchForm.getValueObject(),
                publisherAlterationSearchForm.getValueObject()
        );
    }
}
