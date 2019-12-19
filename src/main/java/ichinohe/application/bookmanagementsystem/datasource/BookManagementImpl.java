package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.datasource.entry.書籍情報登録Mapper;
import ichinohe.application.bookmanagementsystem.domain.BookManagementRepository;
import ichinohe.application.bookmanagementsystem.domain.entry.国際標準図書番号;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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
    public Optional<書籍> findOrThrow(国際標準図書番号 isbn) {
        return Optional.ofNullable(bookFindMapper.select(
                isbn.getValue()));
    }
}
