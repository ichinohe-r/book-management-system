package ichinohe.application.bookmanagementsystem.domain.core

class FixtureBookEntity {
    def get(){
        return new BookEntity(
                new FixtureBookManagementNumber().getOne(),
                new FixtureAuthor().get(),
                new FixtureBookTitle().get(),
                new FixturePublisher().get()
        )
    }
    def getOther(){
        return new BookEntity(
                new FixtureBookManagementNumber().getTwo(),
                new FixtureAuthor().getOther(),
                new FixtureBookTitle().get(),
                new FixturePublisher().get()
        )
    }
}
