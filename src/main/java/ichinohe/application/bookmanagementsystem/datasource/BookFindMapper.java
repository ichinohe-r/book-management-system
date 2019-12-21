package ichinohe.application.bookmanagementsystem.datasource;

import ichinohe.application.bookmanagementsystem.domain.entry.Author;
import ichinohe.application.bookmanagementsystem.domain.entry.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.entry.InternationalStandardBookNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookFindMapper {
    @Select("SELECT author " +
            "FROM book_info " +
            "WHERE " +
            "author = #{author}"
    )
    Author selectAuthor(
            @Param("author") String author
    );

    @Select("SELECT book_title " +
            "FROM book_info " +
            "WHERE " +
            "book_title = #{bookTitle}"
    )
    BookTitle selectBookTitle(
            @Param("bookTitle") String bookTitle
    );

    @Select("SELECT isbn " +
            "FROM book_info " +
            "WHERE " +
            "isbn = #{isbn}"
    )
    InternationalStandardBookNumber selectIsbn(
            @Param("isbn") String isbn
    );
}
