package ichinohe.application.bookmanagementsystem.domain.core;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import org.springframework.stereotype.Repository;

/**
 * イベントレポジトリ
 */
@Repository
public interface EventRepository {
    void entryEventRecord(BookEntity bookEntity);

    void deleteEventRecord(BookDeleteApplication application);

    void alterationEventRecord(BookAlterationApplication application);
}
