package ichinohe.application.bookmanagementsystem.datasource.core;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 書籍を探す
 */
@Mapper
@Repository
public interface BookFindMapper {
    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author} " +
            "AND " +
            "book_title = #{bookTitle} " +
            "AND " +
            "publisher = #{publisher} " +
            "AND " +
            "management_status = 'alive' " +
            "AND " +
            "ROWNUM <= 1" +
            "ORDER BY book_management_number"
    )
    ResultBook findAliveBookByAllKeyword(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author} " +
            "AND " +
            "book_title = #{bookTitle} " +
            "AND " +
            "publisher = #{publisher} " +
            "AND " +
            "management_status = 'alive' " +
            "AND " +
            "ROWNUM <= 1" +
            "ORDER BY book_management_number"
    )
    ResultBookEntity findAliveBookEntityByAllKeyword(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );

    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_management_number = #{bookManagementNumber} " +
            "AND " +
            "management_status = 'alive'"
    )
    ResultBook findAliveBookByBookManagementNumber(
            @Param("bookManagementNumber") int bookManagementNumber
    );
}
