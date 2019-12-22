package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import ichinohe.application.bookmanagementsystem.domain.entry.BookTitle;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * << Value Object >> フォームに入力された書籍名の内容
 */
@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class BookTitleForm {
    @Getter
    private final String value;

    public BookTitle getValueObject(){
        return new BookTitle(value);
    }
}
