package ichinohe.application.bookmanagementsystem.service;

import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRecordService {
    @Autowired
    BookEntryRepository bookEntryRepository;

    public void entry(BookEntryApplication bookEntryApplication){

    }
}
