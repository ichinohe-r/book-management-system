package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * システムのイベント
 */
@AllArgsConstructor
public enum Event {
    ENTRY("entry"),
    DELETE("logicalDelete"),
    ALTERATION("alteration");

    @Getter
    private final String value;
}
