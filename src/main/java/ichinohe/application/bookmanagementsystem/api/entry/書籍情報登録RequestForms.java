package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.api.entry.Forms.国際標準図書番号Form;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.書籍名Form;
import ichinohe.application.bookmanagementsystem.api.entry.Forms.著者Form;
import ichinohe.application.bookmanagementsystem.domain.entry.受付日時;
import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍名;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.domain.entry.著者;
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

    public 書籍登録申込書 createApplication(受付日時 receptionDateAndTime) {
        return new 書籍登録申込書(
                new 著者(authorForm.getValue()),
                new 書籍名(bookTitleForm.getValue()),
                new 国際標準図書番号(isbnForm.getValue()),
                receptionDateAndTime
        );
    }
}
