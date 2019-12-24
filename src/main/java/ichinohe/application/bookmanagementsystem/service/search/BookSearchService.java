package ichinohe.application.bookmanagementsystem.service.search;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 書籍検索サービス
 */
@Service
public class BookSearchService {
    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> search(BookSearchApplication application) {
        return bookRepository.search(application);
    }
}
