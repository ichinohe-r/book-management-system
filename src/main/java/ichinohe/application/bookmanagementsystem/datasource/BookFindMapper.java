package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.domain.entry.書籍;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookFindMapper {
    @Select("SELECT isbn " +
            "FROM book_info " +
            "WHERE " +
            "isbn = #{isbn}"
    )
    書籍 select(
            @Param("isbn") String isbn
    );
}
