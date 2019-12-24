package ichinohe.application.bookmanagementsystem.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ManagementStatus {
    ALIVE("alive"),
    DISPOSALE("disposal");

    @Getter
    private final String value;
}
