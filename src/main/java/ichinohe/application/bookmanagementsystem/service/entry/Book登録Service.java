package ichinohe.application.bookmanagementsystem.service.entry;

import ichinohe.application.bookmanagementsystem.domain.entry.BookInfoEntryRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book登録Service {
    @Autowired
    private BookInfoEntryRepository repository;

    public void entry(書籍登録申込書 application) {
        repository.apply(application);
    }
}
