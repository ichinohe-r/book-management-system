package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.api.entry.Forms.InternationalStandardBookNumberForm;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.BookTitleForm;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.AuthorForm;
import ichinohe.application.bookmanagementsystem.domain.entry.ReceiptDateTime;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * << 集合 Value Object >> 登録したい書籍のリクエスト内容
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookEntryRequestForms {

    private final AuthorForm authorForm;

    private final BookTitleForm bookTitleForm;

    private final InternationalStandardBookNumberForm isbnForm;

    public BookEntryApplication createApplication(ReceiptDateTime receptionDateAndTime) {
        return new BookEntryApplication(
                authorForm.getValueObject(),
                bookTitleForm.getValueObject(),
                isbnForm.getValueObject(),
                receptionDateAndTime
        );
    }
}
