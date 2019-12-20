package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.domain.entry.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookFindMapper {
    @Select("SELECT author, title, isbn " +
            "FROM book_info " +
            "WHERE " +
            "isbn = #{isbn}"
    )
    List<Book> select(
            @Param("isbn") String isbn
    );
}
