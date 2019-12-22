package ichinohe.application.bookmanagementsystem.domain;

import ichinohe.application.bookmanagementsystem.service.ExistConfirmResult;

public class BookManagementPolicy {
    public static Result entryJudge(ExistConfirmResult result) {
        if (result.isExist()) {
            return Result.ENTRY_NG;
        }
        return Result.ENTRY_OK;
    }
}
