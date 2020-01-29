package ichinohe.application.bookmanagementsystem.service.core

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import ichinohe.application.bookmanagementsystem.domain.alteration.FixtureBookAlterationApplication
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository
import ichinohe.application.bookmanagementsystem.domain.core.EventRepository
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookEntity
import ichinohe.application.bookmanagementsystem.domain.delete.FixtureBookDeleteApplication
import ichinohe.application.bookmanagementsystem.domain.entry.FixtureBookEntryApplication
import spock.lang.Specification

class EventRecordServiceTest extends Specification {
    @Subject
    private EventRecordService service
    @Collaborator
    private BookRepository bookRepository = Mock(BookRepository)
    @Collaborator
    private EventRepository eventRepository = Mock(EventRepository)

    def "登録"() {
        setup:
        BookEntity bookEntity = new FixtureBookEntity().get()

        when:
        service.entry(new FixtureBookEntryApplication().get())

        then:
        1 * bookRepository.findAliveBook(new FixtureBookEntryApplication().get()) >> bookEntity
        1 * eventRepository.entryEventRecord(bookEntity)
    }

    def "削除"() {
        when:
        service.delete(new FixtureBookDeleteApplication().get())

        then:
        1 * eventRepository.deleteEventRecord(new FixtureBookDeleteApplication().get())
    }

    def "更新"() {
        when:
        service.alteration(new FixtureBookAlterationApplication().get())

        then:
        1 * eventRepository.alterationEventRecord(new FixtureBookAlterationApplication().get())
    }
}
