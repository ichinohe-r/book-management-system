package ichinohe.application.bookmanagementsystem.datasource.entry;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface 書籍情報登録Mapper {
    @Insert("INSERT INTO book_info (isbn, bookTitle, author, receptionDateAndTime) VALUES (#{isbn}, #{bookTitle}, #{author}, #{receptionDateAndTime})")
    void insert(
            @Param("isbn") String isbn,
            @Param("bookTitle") String bookTitle,
            @Param("author") String author,
            @Param("receptionDateAndTime") String receptionDateAndTime);
}
