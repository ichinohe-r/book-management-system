package ichinohe.application.bookmanagementsystem.domain.alteration;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import ichinohe.application.bookmanagementsystem.domain.core.UpdateDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookAlterationApplication {
    @Getter
    private final BookManagementNumber bookManagementNumber;
    @Getter
    private final Author author;
    @Getter
    private final BookTitle bookTitle;
    @Getter
    private final Publisher publisher;
    @Getter
    private final UpdateDateTime updateDateTime;

    public int getBookManagementNumberIntValue(){
        return bookManagementNumber.getIntValue();
    }

    public String getAuthorStringValue(){
        return author.getStringValue();
    }

    public String getBookTitleStringValue(){
        return bookTitle.getStringValue();
    }

    public String getPublisherStringValue(){
        return publisher.getStringValue();
    }

    public String getUpdateDateTimeValue(){
        return updateDateTime.getValue().toString();
    }
}
