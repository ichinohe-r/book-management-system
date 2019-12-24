package ichinohe.application.bookmanagementsystem.datasource.core;

import ichinohe.application.bookmanagementsystem.datasource.alteration.BookAlterationMapper;
import ichinohe.application.bookmanagementsystem.datasource.delete.BookDeleteMapper;
import ichinohe.application.bookmanagementsystem.datasource.entry.BookEntryMapper;
import ichinohe.application.bookmanagementsystem.datasource.search.BookEntityListFactory;
import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.core.Event;
import ichinohe.application.bookmanagementsystem.domain.core.ReceiptDateTime;
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
    @Autowired
    private BookAlterationMapper bookAlterationMapper;
    @Autowired
    private EventRecordMapper eventRecordMapper;


    @Override
    public void entry(BookEntryApplication application) {
        bookInfoEntryMapper.insert(
                application.getAuthorStringValue(),
                application.getBookTitleStringValue(),
                application.getPublisherStringValue(),
                application.getReceiptDateTimeStringValue(),
                UpdateDateTime.create().getUpdateTimeStringValue()
        );
    }

    @Override
    public ExistConfirmResult checkByEntryApplication(BookEntryApplication application) {
        ResultBook resultBook = bookFindMapper.findBookByAllKeyword(
                application.getAuthorStringValue(),
                application.getBookTitleStringValue(),
                application.getPublisherStringValue()
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
        ResultBook resultBook = bookFindMapper.findByBookManagementNumber(application.getBookManagementNumberIntValue());
        if (resultBook == null) {
            return ExistConfirmResult.NOT_EXIST;
        }
        return ExistConfirmResult.EXIST;
    }

    @Override
    public void delete(BookDeleteApplication application) {
        bookDeleteMapper.delete(application.getBookManagementNumberIntValue());
    }

    @Override
    public ExistConfirmResult checkByAlterationApplication(BookAlterationApplication application) {
        ResultBook resultBook = bookFindMapper.findByBookManagementNumber(application.getBookManagementNumberIntValue());
        if (resultBook == null) {
            return ExistConfirmResult.NOT_EXIST;
        }
        return ExistConfirmResult.EXIST;
    }

    @Override
    public void alteration(BookAlterationApplication bookAlterationApplication) {
        bookAlterationMapper.alteration(
                bookAlterationApplication.getBookManagementNumberIntValue(),
                bookAlterationApplication.getAuthorStringValue(),
                bookAlterationApplication.getBookTitleStringValue(),
                bookAlterationApplication.getPublisherStringValue(),
                bookAlterationApplication.getUpdateDateTimeValue());
    }

    @Override
    public BookEntity find(BookEntryApplication application) {
        ResultBookEntity resultBookEntity = bookFindMapper.findBookEntityByAllKeyword(
                application.getAuthorStringValue(),
                application.getBookTitleStringValue(),
                application.getPublisherStringValue()
        );
        return resultBookEntity.restore();
    }

    @Override
    public void entryEventRecord(BookEntity bookEntity) {
        eventRecordMapper.insert(
                bookEntity.getBookManagementNumber().getIntValue(),
                Event.ENTRY.getValue(),
                ReceiptDateTime.create().getReceiptTimeStringValue()
        );
    }
}
