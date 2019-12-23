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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookEntityListFactory {
    @Autowired
    BookSearchMapper bookSearchMapper;

    public List<BookEntity> search(BookSearchApplication application) {
        String author = application.getAuthor().getValue();
        String bookTitle = application.getBookTitle().getValue();
        String publisher = application.getPublisher().getValue();


            // 著者で検索
            List<ResultBookEntity> resultBookEntityList = bookSearchMapper.searchBookByAuthor(author);

            return resultBookEntityList.stream()
                    .map(resultBook -> new BookEntity(
                            new BookManagementNumber(resultBook.getBook_management_number()),
                            new Author(resultBook.getAuthor()),
                            new BookTitle(resultBook.getBook_title()),
                            new Publisher(resultBook.getPublisher()))
                    ).collect(Collectors.toList());

//        // 著者と書籍名、発行元で検索
//        ResultBookEntity resultBookEntity = bookSearchMapper.searchBookByAllKeyword(author, bookTitle, publisher);
//
////        BookEntity bookEntity = resultBookEntity.restore(resultBookEntity);
//        List<BookEntity> bookEntityList = new ArrayList<BookEntity>();
//        bookEntityList.add(new BookEntity(
//                new BookManagementNumber(resultBookEntity.getBook_management_number()) ,
//                new Author(resultBookEntity.getAuthor()),
//                new BookTitle(resultBookEntity.getBook_title()),
//                new Publisher(resultBookEntity.getPublisher()))
//        );
//        return bookEntityList;
    }
}
