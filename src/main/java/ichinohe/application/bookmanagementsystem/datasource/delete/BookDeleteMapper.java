package ichinohe.application.bookmanagementsystem.datasource.delete;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 書籍を削除
 */
@Mapper
@Repository
public interface BookDeleteMapper {
    @Delete("DELETE FROM book_info " +
            "WHERE " +
            "book_management_number = #{bookManagementNumber}"
    )
    void delete(
            @Param("bookManagementNumber") int bookManagementNumber
    );
}
