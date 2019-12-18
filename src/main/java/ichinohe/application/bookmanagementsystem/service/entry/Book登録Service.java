package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.BookManagementPolicy;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.CheckResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book登録Service {
    @Autowired
    private BookManagementRepository bookManagementRepository;

    public Result entry(書籍登録申込書 application) {

        Result result = entryCheck(application);

        bookManagementRepository.apply(application);

        return result;
    }

    private Result entryCheck(書籍登録申込書 application) {

        国際標準図書番号 isbn = application.getIsbn();

        System.out.println("書籍:"+ bookManagementRepository.find(isbn));

        CheckResult checkResult = BookManagementPolicy.judge(application, bookManagementRepository.find(isbn));

        if (!checkResult.isOK()) {
            return Result.EXIST;
        }
        return Result.OK;
    }
}
