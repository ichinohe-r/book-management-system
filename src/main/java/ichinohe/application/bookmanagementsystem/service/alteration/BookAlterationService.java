package ichinohe.application.bookmanagementsystem.service.alteration;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementPolicy;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.service.core.EventRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAlterationService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private EventRecordService eventRecordService;

    public Result alteration(BookAlterationApplication application) {
        Result result = alterationCheck(application);
        if (result == Result.ALTERATION_OK) {
            bookRepository.alteration(application);
            eventRecordService.alteration(application);
        }
        return result;
    }

    private Result alterationCheck(BookAlterationApplication application) {
        return BookManagementPolicy.alterationJudge(bookRepository.checkByAlterationApplication(application));
    }
}
