package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.datasource.entry.BookEntryMapper;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.core.UpdateDateTime;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.ExistConfirmResult;
import ichinohe.application.bookmanagementsystem.service.entry.ResultBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookEntryImpl implements BookManagementRepository {
    @Autowired
    private BookEntryMapper bookInfoEntryMapper;
    @Autowired
    private BookFindMapper bookFindMapper;

    @Override
    public void apply(BookEntryApplication application) {
        bookInfoEntryMapper.insert(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getPublisher().getValue(),
                application.getReceptionDateAndTime().getValue().toString(),
                UpdateDateTime.create().getValue().toString()
                );
    }

    @Override
    public ExistConfirmResult check(BookEntryApplication application) {
        ResultBook resultBook = bookFindMapper.findOneBook(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getPublisher().getValue()
        );

        if (resultBook == null) {
            return ExistConfirmResult.NOT_EXIST;
        }
        return ExistConfirmResult.EXIST;
    }

    @Override
    public BookEntity find(BookEntryApplication application) {
        return null;
    }
}
