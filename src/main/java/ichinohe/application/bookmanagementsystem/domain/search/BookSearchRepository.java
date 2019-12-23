package ichinohe.application.bookmanagementsystem.domain.search;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookSearchRepository {
    List<BookEntity> search(BookSearchApplication application);
}
