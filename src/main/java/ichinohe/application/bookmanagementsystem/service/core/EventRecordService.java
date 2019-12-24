package ichinohe.application.bookmanagementsystem.service.core;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRecordService {
    @Autowired
    private BookRepository bookRepository;

    public void entry(BookEntryApplication bookEntryApplication){
        BookEntity bookEntity =bookRepository.findAliveBook(bookEntryApplication);
        bookRepository.entryEventRecord(bookEntity);
    }

    public void delete(BookDeleteApplication application){
        bookRepository.deleteEventRecord(application);
    }

}
