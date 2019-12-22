package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 結果
 */
@AllArgsConstructor
public enum Result {
    ENTRY_OK("書籍を登録しました。"),
    ENTRY_NG("書籍は既に登録済のため、登録できませんでした。");

    @Getter
    private final String result;
}
