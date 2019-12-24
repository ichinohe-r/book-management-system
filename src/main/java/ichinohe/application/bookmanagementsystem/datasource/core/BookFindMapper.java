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
            "ROWNUM <= 1" +
            "ORDER BY book_management_number"
    )
    ResultBook findBookByAllKeyword(
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
            "ROWNUM <= 1" +
            "ORDER BY book_management_number"
    )
    ResultBookEntity findBookEntityByAllKeyword(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );

    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author} " +
            "ORDER BY book_management_number"
    )
    List<ResultBook> findByAuthor(
            @Param("author") String author
    );

    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle} " +
            "ORDER BY book_management_number"
    )
    List<ResultBook> findByBookTitle(
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "publisher = #{publisher} " +
            "ORDER BY book_management_number"
    )
    List<ResultBook> findByPublisher(
            @Param("publisher") String publisher
    );

    @Select("SELECT author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_management_number = #{bookManagementNumber}"
    )
    ResultBook findByBookManagementNumber(
            @Param("bookManagementNumber") int bookManagementNumber
    );
}
