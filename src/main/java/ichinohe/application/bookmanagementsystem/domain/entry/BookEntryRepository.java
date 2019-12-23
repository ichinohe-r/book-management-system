package ichinohe.application.bookmanagementsystem.domain.entry;

import org.springframework.stereotype.Repository;

@Repository
public interface BookEntryRepository {
    void apply(BookEntryApplication application);

    ExistConfirmResult check(BookEntryApplication application);

//    BookEntity find(BookEntryApplication application);
}
