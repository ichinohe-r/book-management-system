package ichinohe.application.bookmanagementsystem.datasource.core;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 受付を永続化
 */
@Mapper
@Repository
public interface EventRecordMapper {
    @Insert(
            "INSERT INTO book_management_event (" +
                    "book_management_number, " +
                    "event_info, " +
                    "record_date_time" +
                    ") " +
                    "VALUES (" +
                    "#{bookManagementNumber}, " +
                    "#{event_info}, " +
                    "#{recordDateTime})"
    )
    void insert(
            @Param("bookManagementNumber") int bookManagementNumber,
            @Param("event_info") String eventInfo,
            @Param("recordDateTime") String recordDateTime
    );
}
