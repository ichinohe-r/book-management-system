package ichinohe.application.bookmanagementsystem.service;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRecordService {
//    @Autowired
//    BookManagementEventRepository bookManagementEventRepository;
    @Autowired
    BookManagementRepository bookManagementRepository;

    public void entry(BookEntryApplication bookEntryApplication){

    }
}
