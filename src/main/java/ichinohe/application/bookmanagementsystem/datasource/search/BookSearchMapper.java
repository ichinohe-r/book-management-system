package ichinohe.application.bookmanagementsystem.datasource.search;

import ichinohe.application.bookmanagementsystem.datasource.core.ResultBookEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookSearchMapper {
    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author} " +
            "AND " +
            "book_title = #{bookTitle} " +
            "AND " +
            "publisher = #{publisher} " +
            "AND " +
            "management_status = 'alive'"
    )
    @Results(id = "resultBookEntity", value = {
            @Result(id = true, column = "book_management_number", property = "book_management_number"),
            @Result(id = true, column = "author", property = "author"),
            @Result(id = true, column = "book_title", property = "book_title"),
            @Result(id = true, column = "publisher", property = "publisher")
    })
    List<ResultBookEntity> searchAliveBookByAllKeyword(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author} " +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByAuthor(
            @Param("author") String author
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}" +
            "AND " +
            "book_title = #{bookTitle} " +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByAuthorAndBookTitle(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}" +
            "AND " +
            "publisher = #{publisher} " +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByAuthorAndPublisher(
            @Param("author") String author,
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle}" +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByBookTitle(
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle}" +
            "AND " +
            "publisher = #{publisher} " +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByBookTitleAndPublisher(
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );


    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "publisher = #{publisher}" +
            "AND " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookByPublisher(
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "management_status = 'alive'"
    )
    List<ResultBookEntity> searchAliveBookAll();
}
