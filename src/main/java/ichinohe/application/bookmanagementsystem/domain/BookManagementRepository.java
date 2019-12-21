package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.BookEntryInfoConfirmResult;
import org.springframework.stereotype.Repository;

@Repository
public interface BookManagementRepository {
    void apply(BookEntryApplication application);

    BookEntryInfoConfirmResult check(BookEntryApplication application);
}
