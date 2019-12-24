package ichinohe.application.bookmanagementsystem.domain.delete

import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookManagementNumber

class FixtureBookDeleteApplication {
    def get() {
        return new BookDeleteApplication(
                new FixtureBookManagementNumber().getOne()
        )
    }
}
