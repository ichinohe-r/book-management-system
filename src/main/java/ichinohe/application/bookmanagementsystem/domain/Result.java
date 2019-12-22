package ichinohe.application.bookmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * サービスクラスの処理結果
 */
@AllArgsConstructor
public enum Result {
    ENTRY_OK("書籍を登録しました。"),
    ENTRY_NG("書籍は既に登録済のため、登録できませんでした。");

    @Getter
    private final String result;
}
