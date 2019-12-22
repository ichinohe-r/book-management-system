package ichinohe.application.bookmanagementsystem.datasource.entry;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 書籍を永続化
 */
@Mapper
public interface BookEntryMapper {
    @Insert(
            "INSERT INTO book_info (" +
                    "author, " +
                    "book_title, " +
                    "isbn, " +
                    "event_date_time" +
                    ") " +
                    "VALUES (" +
                    "#{author}, " +
                    "#{bookTitle}, " +
                    "#{isbn}, " +
                    "#{receptionDateAndTime})"
    )
    void insert(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("isbn") String isbn,
            @Param("receptionDateAndTime") String receptionDateAndTime
    );
}
