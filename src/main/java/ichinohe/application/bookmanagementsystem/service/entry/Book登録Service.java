package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.InternationalStandardBookNumber;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.service.BookEntryInfoConfirmResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book登録Service {
    @Autowired
    private BookManagementRepository bookManagementRepository;

    public Result entry(BookEntryApplication application) {

        Result result = entryCheck(application);

        bookManagementRepository.apply(application);

        return result;
    }

    private Result entryCheck(BookEntryApplication application) {
        BookEntryInfoConfirmResult result = bookManagementRepository.check(application);

        if (result.isOK()) {
            return Result.EXIST;
        }
        return Result.OK;
    }
}
