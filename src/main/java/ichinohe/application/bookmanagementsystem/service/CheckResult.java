package ichinohe.application.bookmanagementsystem.service;

public enum CheckResult {
    OK,
    EXIST;

    public boolean isOK() {
        return this == CheckResult.OK;
    }

}
