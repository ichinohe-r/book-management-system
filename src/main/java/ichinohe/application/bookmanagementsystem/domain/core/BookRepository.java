package ichinohe.application.bookmanagementsystem.domain.core;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 書籍レポジトリ
 */
@Repository
public interface BookRepository {
    void entry(BookEntryApplication application);

    ExistConfirmResult checkByEntryApplication(BookEntryApplication application);

    List<BookEntity> search(BookSearchApplication application);

    ExistConfirmResult checkByDeleteApplication(BookDeleteApplication application);

    void delete(BookDeleteApplication application);

    ExistConfirmResult checkByAlterationApplication(BookAlterationApplication application);

    void alteration(BookAlterationApplication bookAlterationApplication);

    BookEntity findAliveBook(BookEntryApplication application);
}
