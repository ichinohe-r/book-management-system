package ichinohe.application.bookmanagementsystem.domain.core;

import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    void entry(BookEntryApplication application);

    ExistConfirmResult checkByEntryApplication(BookEntryApplication application);

    List<BookEntity> search(BookSearchApplication application);

    ExistConfirmResult checkByDeleteApplication(BookDeleteApplication application);

    void delete(BookDeleteApplication application);

//    BookEntity find(BookEntryApplication application);
}
