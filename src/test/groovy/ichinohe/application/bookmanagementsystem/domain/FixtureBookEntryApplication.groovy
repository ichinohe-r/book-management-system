package ichinohe.application.bookmanagementsystem.domain

import ichinohe.application.bookmanagementsystem.domain.core.FixtureAuthor
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookTitle
import ichinohe.application.bookmanagementsystem.domain.core.FixturePublisher
import ichinohe.application.bookmanagementsystem.domain.core.FixtureReceiptDateTime
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication

class FixtureBookEntryApplication {
    def get(){
        return new BookEntryApplication(
                new FixtureAuthor().get(),
                new FixtureBookTitle().get(),
                new FixturePublisher().get(),
                new FixtureReceiptDateTime().get()
        )
    }
}
