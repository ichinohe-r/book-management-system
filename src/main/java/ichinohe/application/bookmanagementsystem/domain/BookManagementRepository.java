package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.CheckResult;
import org.springframework.stereotype.Repository;

@Repository
public interface BookManagementRepository {
    void apply(書籍登録申込書 application);

    CheckResult check(国際標準図書番号 isbn);
}
