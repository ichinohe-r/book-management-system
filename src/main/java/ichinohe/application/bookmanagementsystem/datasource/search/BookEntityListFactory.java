package ichinohe.application.bookmanagementsystem.datasource.search;

import ichinohe.application.bookmanagementsystem.datasource.core.ResultBookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 書籍検索申込書の内容に合わせて検索させるクラス
 */
@Repository
public class BookEntityListFactory {
    @Autowired
    BookSearchMapper bookSearchMapper;

    public List<BookEntity> search(BookSearchApplication application) {
        // 著者で検索
        if (!application.getAuthorStringValue().isEmpty() &&
                application.getBookTitleStringValue().isEmpty() &&
                application.getPublisherStringValue().isEmpty()) {
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByAuthor(
                    application.getAuthorStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 書籍名で検索
        if (application.getAuthorStringValue().isEmpty() &&
                !application.getBookTitleStringValue().isEmpty() &&
                application.getPublisherStringValue().isEmpty()) {
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByBookTitle(
                    application.getBookTitleStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }


        // 発行元で検索
        if (application.getAuthorStringValue().isEmpty() &&
                application.getBookTitleStringValue().isEmpty() &&
                !application.getPublisherStringValue().isEmpty()) {
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByPublisher(
                    application.getPublisherStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 著者と発行元で検索
        if (!application.getAuthorStringValue().isEmpty() &&
                application.getBookTitleStringValue().isEmpty() &&
                !application.getPublisherStringValue().isEmpty()) {
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByAuthorAndPublisher(
                    application.getAuthorStringValue(),
                    application.getPublisherStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 書籍名と発行元で検索
        if (application.getAuthorStringValue().isEmpty() &&
                !application.getBookTitleStringValue().isEmpty() &&
                !application.getPublisherStringValue().isEmpty()) {
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByBookTitleAndPublisher(
                    application.getBookTitleStringValue(),
                    application.getPublisherStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 著者と書籍名で検索
        if (!application.getAuthorStringValue().isEmpty() &&
                !application.getBookTitleStringValue().isEmpty() &&
                application.getPublisherStringValue().isEmpty()) {

            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByAuthorAndBookTitle(
                    application.getAuthorStringValue(),
                    application.getBookTitleStringValue()
            );
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 著者と書籍名、発行元で検索
        if (!application.getAuthorStringValue().isEmpty() &&
                !application.getBookTitleStringValue().isEmpty() &&
                !application.getPublisherStringValue().isEmpty()) {

            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookByAllKeyword(
                    application.getAuthorStringValue(),
                    application.getBookTitleStringValue(),
                    application.getPublisherStringValue());
            return streamResultBookEntityToBookEntity(resultBookEntityList);
        }

        // 全検索
        List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchAliveBookAll();
        return streamResultBookEntityToBookEntity(resultBookEntityList);
    }

    private List<BookEntity> streamResultBookEntityToBookEntity(List<ResultBookEntity> resultBookEntityList) {
        return resultBookEntityList.stream()
                .map(resultBook -> new BookEntity(
                        new BookManagementNumber(resultBook.getBook_management_number()),
                        new Author(resultBook.getAuthor()),
                        new BookTitle(resultBook.getBook_title()),
                        new Publisher(resultBook.getPublisher()))
                ).collect(Collectors.toList());
    }
}
