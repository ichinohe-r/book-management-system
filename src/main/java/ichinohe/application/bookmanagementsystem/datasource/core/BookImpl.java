package ichinohe.application.bookmanagementsystem.datasource.core;

import ichinohe.application.bookmanagementsystem.datasource.BookFindMapper;
import ichinohe.application.bookmanagementsystem.datasource.delete.BookDeleteMapper;
import ichinohe.application.bookmanagementsystem.datasource.entry.BookEntryMapper;
import ichinohe.application.bookmanagementsystem.datasource.search.BookEntityListFactory;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.core.UpdateDateTime;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookImpl implements BookRepository {
    @Autowired
    private BookEntryMapper bookInfoEntryMapper;
    @Autowired
    private BookFindMapper bookFindMapper;
    @Autowired
    private BookEntityListFactory factory;
    @Autowired
    private BookDeleteMapper bookDeleteMapper;


    @Override
    public void entry(BookEntryApplication application) {
        bookInfoEntryMapper.insert(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getPublisher().getValue(),
                application.getReceptionDateAndTime().getValue().toString(),
                UpdateDateTime.create().getValue().toString()
        );
    }

    @Override
    public ExistConfirmResult checkByEntryApplication(BookEntryApplication application) {
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
    public List<BookEntity> search(BookSearchApplication application) {
        return factory.search(application);
    }

    @Override
    public ExistConfirmResult checkByDeleteApplication(BookDeleteApplication application) {
        ResultBook resultBook = bookFindMapper.findByBookManagementNumber(application.getBookManagementNumberIntegerValue());
        if (resultBook == null) {
            return ExistConfirmResult.NOT_EXIST;
        }
        return ExistConfirmResult.EXIST;
    }

    @Override
    public void delete(BookDeleteApplication application) {
        bookDeleteMapper.delete(application.getBookManagementNumberIntegerValue());
    }
}
