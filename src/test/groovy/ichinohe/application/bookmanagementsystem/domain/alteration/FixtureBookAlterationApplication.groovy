package ichinohe.application.bookmanagementsystem.domain.alteration

import ichinohe.application.bookmanagementsystem.domain.core.FixtureAuthor
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookManagementNumber
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookTitle
import ichinohe.application.bookmanagementsystem.domain.core.FixturePublisher
import ichinohe.application.bookmanagementsystem.domain.core.FixtureUpdateDateTime

class FixtureBookAlterationApplication {
    def get() {
        return new BookAlterationApplication(
                new FixtureBookManagementNumber().getOne(),
                new FixtureAuthor().get(),
                new FixtureBookTitle().get(),
                new FixturePublisher().get(),
                new FixtureUpdateDateTime().get()
        )
    }
}
