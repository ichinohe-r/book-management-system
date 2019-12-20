package ichinohe.application.bookmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public enum Result {
    OK("登録"),
    EXIST("既に登録済");

    @Getter
    private final String result;
}
