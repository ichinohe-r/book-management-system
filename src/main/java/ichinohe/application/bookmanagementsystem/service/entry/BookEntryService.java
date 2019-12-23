package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementPolicy;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryRepository;
import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 書籍登録サービス
 */
@Service
public class BookEntryService {
    @Autowired
    private BookEntryRepository bookEntryRepository;
//    @Autowired
//    private EventRecordService eventRecordService;

    public Result entry(BookEntryApplication application) {
        Result result = entryCheck(application);
        if (result == Result.ENTRY_OK) {
            bookEntryRepository.apply(application);
//            eventRecordService.entry(application);
        }
        return result;
    }

    private Result entryCheck(BookEntryApplication application) {
        return BookManagementPolicy.entryJudge(bookEntryRepository.check(application));
    }
}
