package ichinohe.application.bookmanagementsystem.api.search;

import ichinohe.application.bookmanagementsystem.api.search.Forms.AuthorSearchForm;
import ichinohe.application.bookmanagementsystem.api.search.Forms.BookTitleSearchForm;
import ichinohe.application.bookmanagementsystem.api.search.Forms.PublisherSearchForm;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookSearchRequest {
    private final AuthorSearchForm authorSearchForm;

    private final BookTitleSearchForm bookTitleSearchForm;

    private final PublisherSearchForm publisherSearchForm;

    public BookSearchApplication createApplication() {
        return new BookSearchApplication(
                authorSearchForm.getValueObject(),
                bookTitleSearchForm.getValueObject(),
                publisherSearchForm.getValueObject()
        );
    }
}
