package ichinohe.application.bookmanagementsystem.domain.core

class FixtureAuthor {
    def get(){
        new Author("サンプル著者")
    }
    def getOther(){
        new Author("有名人サンプル著者")
    }
}
