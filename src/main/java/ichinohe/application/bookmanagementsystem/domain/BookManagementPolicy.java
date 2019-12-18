package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.CheckResult;

public class BookManagementPolicy {
    public static CheckResult judge(
            書籍登録申込書 bookEntryApplication,
            書籍 book) {

        System.out.println("書籍登録申込書：" + bookEntryApplication);

        System.out.println("書籍：" + book);

        if (book.getBookTitle().equals(bookEntryApplication.getBookTitle())) {
            return CheckResult.EXIST;
        }
        return CheckResult.OK;
    }
}
