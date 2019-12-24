package ichinohe.application.bookmanagementsystem.service.delete;

import ichinohe.application.bookmanagementsystem.domain.core.BookManagementPolicy;
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository;
import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.service.core.EventRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 書籍削除サービス
 */
@Service
public class BookDeleteService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private EventRecordService eventRecordService;

    public Result delete(BookDeleteApplication application){
        Result result = deleteCheck(application);
        if (result == Result.DELETE_OK) {
            bookRepository.delete(application);
            eventRecordService.delete(application);
        }
        return result;
    }

    private Result deleteCheck(BookDeleteApplication application){
        return BookManagementPolicy.deleteJudge(bookRepository.checkByDeleteApplication(application));
    }
}
