package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 書籍の管理ステータス
 */
@AllArgsConstructor
public enum ManagementStatus {
    ALIVE("alive"),
    DISPOSALE("disposal");

    @Getter
    private final String value;
}
