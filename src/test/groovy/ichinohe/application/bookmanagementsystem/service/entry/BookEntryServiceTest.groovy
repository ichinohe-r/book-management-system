package ichinohe.application.bookmanagementsystem.service.entry

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult
import ichinohe.application.bookmanagementsystem.domain.entry.FixtureBookEntryApplication
import ichinohe.application.bookmanagementsystem.service.core.EventRecordService
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BookEntryServiceTest extends Specification {
    @Subject
    private BookEntryService service

    @Collaborator
    private BookRepository bookRepository = Mock(BookRepository)

    @Collaborator
    private EventRecordService eventRecordService = Mock()


    def "登録#OK"() {
        when:
        service.entry(new FixtureBookEntryApplication().get())

        then:
        1 * bookRepository.checkByEntryApplication(new FixtureBookEntryApplication().get()) >> ExistConfirmResult.NOT_EXIST
        1 * bookRepository.entry(new FixtureBookEntryApplication().get())
        1 * eventRecordService.entry(new FixtureBookEntryApplication().get())
    }

    def "登録#NG"() {
        when:
        service.entry(new FixtureBookEntryApplication().get())

        then:
        1 * bookRepository.checkByEntryApplication(new FixtureBookEntryApplication().get()) >> ExistConfirmResult.EXIST
        0 * bookRepository.entry(new FixtureBookEntryApplication().get())
        0 * eventRecordService.entry(new FixtureBookEntryApplication().get())
    }
}
