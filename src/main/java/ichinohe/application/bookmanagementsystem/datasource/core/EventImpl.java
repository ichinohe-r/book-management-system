package ichinohe.application.bookmanagementsystem.datasource.core;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.Event;
import ichinohe.application.bookmanagementsystem.domain.core.EventRepository;
import ichinohe.application.bookmanagementsystem.domain.core.ReceiptDateTime;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventImpl implements EventRepository {
    @Autowired
    private EventRecordMapper eventRecordMapper;

    @Override
    public void entryEventRecord(BookEntity bookEntity) {
        eventRecordMapper.insert(
                bookEntity.getBookManagementNumber().getIntValue(),
                Event.ENTRY.getValue(),
                ReceiptDateTime.create().getReceiptTimeStringValue()
        );
    }

    @Override
    public void deleteEventRecord(BookDeleteApplication application) {
        eventRecordMapper.insert(
                application.getBookManagementNumberIntValue(),
                Event.DELETE.getValue(),
                ReceiptDateTime.create().getReceiptTimeStringValue()
        );
    }

    @Override
    public void alterationEventRecord(BookAlterationApplication application) {
        eventRecordMapper.insert(
                application.getBookManagementNumberIntValue(),
                Event.ALTERATION.getValue(),
                ReceiptDateTime.create().getReceiptTimeStringValue()
        );
    }
}
