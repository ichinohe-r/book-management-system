package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.datasource.entry.BookEntryMapper;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.ExistConfirmResult;
import ichinohe.application.bookmanagementsystem.service.entry.ResultBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookManagementImpl implements BookManagementRepository {
    @Autowired
    private BookEntryMapper bookInfoEntryMapper;
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
    public ExistConfirmResult check(BookEntryApplication application) {

//        Book bookLists = new Book(
//                bookFindMapper.selectAuthor(application.getAuthor().getValue()),
//                bookFindMapper.selectBookTitle(application.getBookTitle().getValue()),
//                bookFindMapper.selectIsbn(application.getIsbn().getValue())
//        );
        ResultBook resultBook = bookFindMapper.findOneBook(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getIsbn().getValue()
        );

        if (resultBook == null) {
            return ExistConfirmResult.NOT_EXIST;
        }
        return ExistConfirmResult.EXIST;
    }
}
