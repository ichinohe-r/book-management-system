package ichinohe.application.bookmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * サービスクラスの処理結果
 */
@AllArgsConstructor
public enum Result {
    ENTRY_OK("登録"),
    ENTRY_NG("既に登録済");

    @Getter
    private final String result;
}
