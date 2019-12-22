package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.api.entry.Forms.AuthorForm;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.BookTitleForm;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.PublisherForm;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.core.ReceiptDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * << 集合 Value Object >> 登録したい書籍のリクエスト内容
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookEntryRequest {

    private final AuthorForm authorForm;

    private final BookTitleForm bookTitleForm;

    private final PublisherForm publisherForm;

    public BookEntryApplication createApplication(ReceiptDateTime receptionDateAndTime) {
        return new BookEntryApplication(
                authorForm.getValueObject(),
                bookTitleForm.getValueObject(),
                publisherForm.getValueObject(),
                receptionDateAndTime
        );
    }
}
