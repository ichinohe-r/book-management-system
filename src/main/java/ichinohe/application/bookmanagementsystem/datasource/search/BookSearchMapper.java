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
            "publisher = #{publisher}"
    )
    @Results(id = "resultBookEntity", value = {
            @Result(id = true, column = "book_management_number", property = "book_management_number"),
            @Result(id = true, column = "author", property = "author"),
            @Result(id = true, column = "book_title", property = "book_title"),
            @Result(id = true, column = "publisher", property = "publisher")
    })
    List<ResultBookEntity> searchBookByAllKeyword(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}"
    )
    List<ResultBookEntity> searchBookByAuthor(
            @Param("author") String author
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}" +
            "AND " +
            "book_title = #{bookTitle}"
    )
    List<ResultBookEntity> searchBookByAuthorAndBookTitle(
            @Param("author") String author,
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}" +
            "AND " +
            "publisher = #{publisher}"
    )
    List<ResultBookEntity> searchBookByAuthorAndPublisher(
            @Param("author") String author,
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle}"
    )
    List<ResultBookEntity> searchBookByBookTitle(
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle}" +
            "AND " +
            "publisher = #{publisher}"
    )
    List<ResultBookEntity> searchBookByBookTitleAndPublisher(
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher
    );


    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info " +
            "WHERE " +
            "publisher = #{publisher}"
    )
    List<ResultBookEntity> searchBookByPublisher(
            @Param("publisher") String publisher
    );

    @Select("SELECT book_management_number, author, book_title, publisher " +
            "FROM book_info"
    )
    List<ResultBookEntity> searchAll();
}