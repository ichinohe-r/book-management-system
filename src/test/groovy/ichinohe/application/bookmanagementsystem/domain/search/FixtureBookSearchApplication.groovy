package ichinohe.application.bookmanagementsystem.domain.search

import ichinohe.application.bookmanagementsystem.domain.core.FixtureAuthor
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookTitle
import ichinohe.application.bookmanagementsystem.domain.core.FixturePublisher

class FixtureBookSearchApplication {
    def get() {
        return new BookSearchApplication(
                new FixtureAuthor().get(),
                new FixtureBookTitle().get(),
                new FixturePublisher().get()
        )
    }
}
