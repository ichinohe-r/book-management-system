package ichinohe.application.bookmanagementsystem.datasource.alteration;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookAlterationMapper {
    @Update("UPDATE book_info " +
            "SET " +
            "author = #{author}, " +
            "book_title = #{bookTitle}, " +
            "publisher = #{publisher}, " +
            "update_time = #{updateDatetime} " +
            "WHERE " +
            "book_management_number = #{bookManagementNumber}"
    )
    void alteration(
            @Param("bookManagementNumber") int bookManagementNumber,
            @Param("author") String author,
            @Param("bookTitle") String bookTitle,
            @Param("publisher") String publisher,
            @Param("updateDatetime") String updateDatetime
    );
}
