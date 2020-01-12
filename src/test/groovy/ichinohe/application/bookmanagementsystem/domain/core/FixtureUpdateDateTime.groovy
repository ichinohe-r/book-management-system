package ichinohe.application.bookmanagementsystem.domain.core

import java.time.LocalDateTime
import java.time.Month

class FixtureUpdateDateTime {
    def get() {
        new UpdateDateTime(LocalDateTime.of(2019, Month.DECEMBER, 25, 6, 0, 00))
    }
}
