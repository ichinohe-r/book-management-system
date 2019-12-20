package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.datasource.entry.書籍情報登録Mapper;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.CheckResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookManagementImpl implements BookManagementRepository {
    @Autowired
    private 書籍情報登録Mapper bookInfoEntryMapper;
    @Autowired
    private BookFindMapper bookFindMapper;

    @Override
    public void apply(書籍登録申込書 application) {
        bookInfoEntryMapper.insert(
                application.getAuthor().getValue(),
                application.getBookTitle().getValue(),
                application.getIsbn().getValue(),
                application.getReceptionDateAndTime().getValue().toString());
    }

    @Override
    public CheckResult check(国際標準図書番号 isbn) {
        書籍 book = bookFindMapper.select(isbn.getValue());
        if (book == null) {
            return CheckResult.OK;
        }
        return CheckResult.EXIST;
    }
}
