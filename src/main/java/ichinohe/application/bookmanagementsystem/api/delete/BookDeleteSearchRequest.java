package ichinohe.application.bookmanagementsystem.api.delete;

import ichinohe.application.bookmanagementsystem.api.delete.Forms.AuthorDeleteForm;
import ichinohe.application.bookmanagementsystem.api.delete.Forms.BookTitleDeleteForm;
import ichinohe.application.bookmanagementsystem.api.delete.Forms.PublisherDeleteForm;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookDeleteSearchRequest {
    private final AuthorDeleteForm authorDeleteForm;

    private final BookTitleDeleteForm bookTitleDeleteForm;

    private final PublisherDeleteForm publisherDeleteForm;

    public BookSearchApplication createApplication() {
        return new BookSearchApplication(
                authorDeleteForm.getValueObject(),
                bookTitleDeleteForm.getValueObject(),
                publisherDeleteForm.getValueObject()
        );
    }
}
