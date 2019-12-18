package ichinohe.application.bookmanagementsystem.domain.entry;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class 書籍 {

    @Getter
    private final 著者 author;
    @Getter
    private final 書籍名 bookTitle;
    @Getter
    private final 国際標準図書番号 isbn;

    public 書籍 create(){
        return new 書籍(
                new 著者(author.getValue()),
                new 書籍名(bookTitle.getValue()),
                new 国際標準図書番号(isbn.getValue()));
    }

}
