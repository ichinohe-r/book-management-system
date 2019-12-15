package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.api.entry.Forms.書籍情報登録Forms;
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
public class 書籍情報登録Request {
    public 書籍情報登録Forms bookInfoEntryForms;

    public 書籍登録申込書 create(受付日時 receptionDateAndTime) {
        return new 書籍登録申込書(
                new 国際標準図書番号(bookInfoEntryForms.getIsbnForm().getValue()),
                new 書籍名(bookInfoEntryForms.getBookTitleForm().getValue()),
                new 著者(bookInfoEntryForms.getAuthorForm().getValue()),
                receptionDateAndTime
        );
    }
}
