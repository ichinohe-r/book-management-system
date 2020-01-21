package ichinohe.application.bookmanagementsystem.service.alteration

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import ichinohe.application.bookmanagementsystem.domain.alteration.FixtureBookAlterationApplication
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository
import ichinohe.application.bookmanagementsystem.domain.entry.ExistConfirmResult
import ichinohe.application.bookmanagementsystem.service.core.EventRecordService
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BookAlterationServiceTest extends Specification {
    @Subject
    private BookAlterationService service

    @Collaborator
    private BookRepository bookRepository = Mock(BookRepository)

    @Collaborator
    private EventRecordService eventRecordService = Mock()

    def "変更#OK"() {
        when:
        service.alteration(new FixtureBookAlterationApplication().get())

        then:
        1 * bookRepository.checkByAlterationApplication(new FixtureBookAlterationApplication().get()) >> ExistConfirmResult.EXIST
        1 * bookRepository.alteration(new FixtureBookAlterationApplication().get())
        1 * eventRecordService.alteration(new FixtureBookAlterationApplication().get())
    }

    def "変更#NG"() {
        when:
        service.alteration(new FixtureBookAlterationApplication().get())

        then:
        1 * bookRepository.checkByAlterationApplication(new FixtureBookAlterationApplication().get()) >> ExistConfirmResult.NOT_EXIST
        0 * bookRepository.alteration(new FixtureBookAlterationApplication().get())
        0 * eventRecordService.alteration(new FixtureBookAlterationApplication().get())
    }
}
