package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.ExistConfirmResult;
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
        bookManagementRepository.apply(application);
        return result;
    }

    private Result entryCheck(BookEntryApplication application) {
        ExistConfirmResult result = bookManagementRepository.check(application);
        if (result.isEXIST()) {
            return Result.ENTRY_NG;
        }
        return Result.ENTRY_OK;
    }
}
