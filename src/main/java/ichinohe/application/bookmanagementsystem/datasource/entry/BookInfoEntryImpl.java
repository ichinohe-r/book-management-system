package ichinohe.application.bookmanagementsystem.datasource.entry;

import ichinohe.application.bookmanagementsystem.domain.entry.BookInfoEntryRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoEntryImpl implements BookInfoEntryRepository {
    @Autowired
    書籍情報登録Mapper mapper;

    @Override
    public void apply(書籍登録申込書 application) {
        mapper.insert(
                application.getIsbn().toString(),
                application.getBookTitle().toString(),
                application.getIsbn().toString(),
                application.getReceptionDateAndTime().getValue().toString());
    }
}
