package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.BookManagementPolicy;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 書籍登録サービス
 */
@Service
public class BookEntryService {
    @Autowired
    private BookManagementRepository bookManagementRepository;

    public Result entry(BookEntryApplication application) {
        Result result = entryCheck(application);
        if (result == Result.ENTRY_OK) {
            bookManagementRepository.apply(application);
        }
        return result;
    }

    private Result entryCheck(BookEntryApplication application) {
        return BookManagementPolicy.entryJudge(bookManagementRepository.check(application));
    }
}
