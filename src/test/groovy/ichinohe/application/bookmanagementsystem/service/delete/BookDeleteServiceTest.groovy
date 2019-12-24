package ichinohe.application.bookmanagementsystem.service.delete

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository
import ichinohe.application.bookmanagementsystem.domain.delete.FixtureBookDeleteApplication
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult
import ichinohe.application.bookmanagementsystem.service.core.EventRecordService
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BookDeleteServiceTest extends Specification {

    @Subject
    private BookDeleteService service

    @Collaborator
    private BookRepository bookRepository = Mock(BookRepository)

    @Collaborator
    private EventRecordService eventRecordService = Mock()

    def "Delete#OK"() {
        when:
        service.delete(new FixtureBookDeleteApplication().get())

        then:
        1 * bookRepository.checkByDeleteApplication(new FixtureBookDeleteApplication().get()) >> ExistConfirmResult.EXIST
        1 * bookRepository.delete(new FixtureBookDeleteApplication().get())
        1 * eventRecordService.delete(new FixtureBookDeleteApplication().get())
    }

    def "Delete#NG"() {
        when:
        service.delete(new FixtureBookDeleteApplication().get())

        then:
        1 * bookRepository.checkByDeleteApplication(new FixtureBookDeleteApplication().get()) >> ExistConfirmResult.NOT_EXIST
        0 * bookRepository.delete(new FixtureBookDeleteApplication().get())
        0 * eventRecordService.delete(new FixtureBookDeleteApplication().get())
    }
}
