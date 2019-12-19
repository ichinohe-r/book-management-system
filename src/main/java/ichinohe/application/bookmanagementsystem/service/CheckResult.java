package ichinohe.application.bookmanagementsystem.service;

import ichinohe.application.bookmanagementsystem.domain.entry.書籍;

import java.util.function.Supplier;

public enum CheckResult implements Supplier<書籍> {
    OK,
    EXIST;

    public boolean isOK() {
        return this == CheckResult.OK;
    }

    @Override
    public 書籍 get() {
        return null;
    }
}
