package ichinohe.application.bookmanagementsystem.service.search;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 書籍検索サービス
 */
@Service
public class BookSearchService {
    @Autowired
    BookSearchRepository bookSearchRepository;

    public List<BookEntity> search(BookSearchApplication application) {
        return bookSearchRepository.search(application);
    }
}
