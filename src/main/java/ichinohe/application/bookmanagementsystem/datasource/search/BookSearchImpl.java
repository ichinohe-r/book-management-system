package ichinohe.application.bookmanagementsystem.datasource.search;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookSearchImpl implements BookSearchRepository {
    @Autowired
    BookEntityListFactory factory;

    @Override
    public List<BookEntity> search(BookSearchApplication application) {
        return factory.search(application);
    }
}
