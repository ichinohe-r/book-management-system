package ichinohe.application.bookmanagementsystem.domain.core;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.ExistConfirmResult;
import org.springframework.stereotype.Repository;

@Repository
public interface BookManagementRepository {
    void apply(BookEntryApplication application);

    ExistConfirmResult check(BookEntryApplication application);

    BookEntity find(BookEntryApplication application);
}