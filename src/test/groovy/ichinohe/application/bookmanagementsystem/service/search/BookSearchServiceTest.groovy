package ichinohe.application.bookmanagementsystem.service.search

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity
import ichinohe.application.bookmanagementsystem.domain.core.BookRepository
import ichinohe.application.bookmanagementsystem.domain.core.FixtureBookEntity
import ichinohe.application.bookmanagementsystem.domain.search.FixtureBookSearchApplication
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BookSearchServiceTest extends Specification {
    @Subject
    private BookSearchService service

    @Collaborator
    private BookRepository bookRepository = Mock(BookRepository)

    def "Search"() {
        setup:
        List<BookEntity> bookEntityList = [new FixtureBookEntity().get(), new FixtureBookEntity().getOther()]
        when:
        service.search(new FixtureBookSearchApplication().get())

        then:
        1 * bookRepository.search(new FixtureBookSearchApplication().get()) >> bookEntityList
    }
}
