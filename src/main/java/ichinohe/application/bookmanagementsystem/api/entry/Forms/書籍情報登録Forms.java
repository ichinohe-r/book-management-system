package ichinohe.application.bookmanagementsystem.api.entry.Forms;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class 書籍情報登録Forms {
    @Getter
    @NotNull
    public final 著者Form authorForm;

    @Getter
    @NotNull
    public final 書籍名Form bookTitleForm;

    @Getter
    @NotNull
    public final 国際標準図書番号Form isbnForm;

}
