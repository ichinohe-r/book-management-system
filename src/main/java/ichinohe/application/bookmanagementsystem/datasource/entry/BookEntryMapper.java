package ichinohe.application.bookmanagementsystem.datasource.entry;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 書籍を永続化
 */
@Mapper
@Repository
public interface BookEntryMapper {
    @Insert(
            "INSERT INTO book_info (" +
                    "author, " +
                    "book_title, " +
                    "publisher, " +
                    "event_date_time, " +
                    "update_time" +
                    ") " +
                    "VALUES (" +
                    "#{author}, " +
                    "#{bookTitle}, " +
                    "#{publisher}, " +
                    "#{receptionDateTime}, " +
                    "#{updateDatetime})"
    )
    void insert(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher,
            @Param("receptionDateTime") String receptionDateTime,
            @Param("updateDatetime") String updateDatetime
    );
}
