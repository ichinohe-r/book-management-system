package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.CheckResult;

import java.util.Optional;

public class BookManagementPolicy {
    public static CheckResult judge(
            書籍登録申込書 bookEntryApplication,
            Optional<書籍> book) {

        System.out.println("書籍登録申込書：" + bookEntryApplication);

        System.out.println("書籍：" + book);
        /*
        チェックロジックはまだ未実装
         */
        return CheckResult.OK;
    }
}
