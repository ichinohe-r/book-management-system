package ichinohe.application.bookmanagementsystem.service;

public enum BookEntryInfoConfirmResult {
    NOT_EXISTS,
    EXIST;

    public boolean isOK() {
        return this == BookEntryInfoConfirmResult.NOT_EXISTS;
    }

}
