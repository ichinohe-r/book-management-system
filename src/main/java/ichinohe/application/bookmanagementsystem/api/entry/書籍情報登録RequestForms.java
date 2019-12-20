package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.api.entry.Forms.国際標準図書番号Form;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.書籍名Form;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.著者Form;
import ichinohe.application.bookmanagementsystem.domain.entry.ReceiptDateTime;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 書籍情報登録RequestForms {

    private final 著者Form authorForm;

    private final 書籍名Form bookTitleForm;

    private final 国際標準図書番号Form isbnForm;

    public BookEntryApplication createApplication(ReceiptDateTime receptionDateAndTime) {
        return new BookEntryApplication(
                authorForm.getValueObject(),
                bookTitleForm.getValueObject(),
                isbnForm.getValueObject(),
                receptionDateAndTime
        );
    }
}
