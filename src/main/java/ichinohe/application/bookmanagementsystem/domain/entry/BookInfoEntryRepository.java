package ichinohe.application.bookmanagementsystem.domain.entry;

import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoEntryRepository {
    void apply(書籍登録申込書 application);
}
