package ichinohe.application.bookmanagementsystem.domain.entry;

/**
 * 書籍の存在確認結果
 */
public enum ExistConfirmResult {
    NOT_EXIST,
    EXIST;

    public boolean isExist() {
        return this == ExistConfirmResult.EXIST;
    }

}
