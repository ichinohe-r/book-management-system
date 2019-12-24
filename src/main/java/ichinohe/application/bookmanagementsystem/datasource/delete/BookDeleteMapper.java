package ichinohe.application.bookmanagementsystem.datasource.delete;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 書籍を論理削除
 */
@Mapper
@Repository
public interface BookDeleteMapper {
    @Update("UPDATE book_info " +
            "SET " +
            "management_status = #{managementStatus} " +
            "WHERE " +
            "book_management_number = #{bookManagementNumber}"
    )
    void logicalDelete(
            @Param("bookManagementNumber") int bookManagementNumber,
            @Param("managementStatus") String managementStatus
    );
}
