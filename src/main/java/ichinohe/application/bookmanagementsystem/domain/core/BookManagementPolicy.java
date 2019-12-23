package ichinohe.application.bookmanagementsystem.domain.core;

import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult;

public class BookManagementPolicy {
    public static Result entryJudge(ExistConfirmResult result) {
        if (result.isExist()) {
            return Result.ENTRY_NG;
        }
        return Result.ENTRY_OK;
    }

    public static Result deleteJude(ExistConfirmResult result){
        if (result.isExist()){
            return Result.DELETE_OK;
        }
        return Result.DELETE_NG;
    }
}
