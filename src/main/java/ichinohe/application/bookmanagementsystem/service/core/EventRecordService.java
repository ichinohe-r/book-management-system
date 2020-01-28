package ichinohe.application.bookmanagementsystem.service.core;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.core.EventRepository;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * イベント記録
 */
@Service
public class EventRecordService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private EventRepository eventRepository;

    public void entry(BookEntryApplication application) {
        BookEntity bookEntity = bookRepository.findAliveBook(application);
        eventRepository.entryEventRecord(bookEntity);
    }

    public void delete(BookDeleteApplication application) {
        eventRepository.deleteEventRecord(application);
    }

    public void alteration(BookAlterationApplication application) {
        eventRepository.alterationEventRecord(application);
    }

}
