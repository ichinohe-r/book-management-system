package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class BookEntityList {
    private final List<BookEntity> bookEntityList;

    public boolean isExist() {
        return this.bookEntityList != null;
    }

}
