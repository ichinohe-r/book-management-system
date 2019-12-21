package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.datasource.entry.書籍情報登録Mapper;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.Book;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.BookEntryInfoConfirmResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookManagementImpl implements BookManagementRepository {
    @Autowired
    private 書籍情報登録Mapper bookInfoEntryMapper;
    @Autowired
    private BookFindMapper bookFindMapper;

    @Override
    public void apply(BookEntryApplication application) {
        bookInfoEntryMapper.insert(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getIsbn().getValue(),
                application.getReceptionDateAndTime().getValue().toString());
    }

    @Override
    public BookEntryInfoConfirmResult check(BookEntryApplication application) {

        Book bookLists = new Book(
                bookFindMapper.selectAuthor(application.getAuthor().getValue()),
                bookFindMapper.selectBookTitle(application.getBookTitle().getValue()),
                bookFindMapper.selectIsbn(application.getIsbn().getValue())
        );
        if (bookLists == null) {
            return BookEntryInfoConfirmResult.NOT_EXISTS;
        }
        return BookEntryInfoConfirmResult.EXIST;
    }
}
