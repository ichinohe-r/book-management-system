package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookManagementRepository {
    void apply(書籍登録申込書 application);

    Optional<書籍> findOrThrow(国際標準図書番号 isbn);
}
