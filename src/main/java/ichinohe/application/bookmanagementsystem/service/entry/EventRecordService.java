package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRecordService {
    @Autowired
    private BookRepository bookRepository;

    public void entry(BookEntryApplication bookEntryApplication){
        BookEntity bookEntity =bookRepository.find(bookEntryApplication);
        bookRepository.entryEventRecord(bookEntity);
    }
}
