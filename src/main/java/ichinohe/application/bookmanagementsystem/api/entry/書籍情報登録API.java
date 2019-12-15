package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.domain.entry.受付日時;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.entry.Book登録Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class 書籍情報登録API {
    public final String URI = "/book-entry";
    public final String NAME = "書籍情報登録API";

    @Autowired
    Book登録Service service;

    @RequestMapping(value = URI, method = RequestMethod.GET)
    public void apply(書籍情報登録Request request) {

        書籍登録申込書 application = request.create(受付日時.create());

        service.entry(application);

//        return null;
    }
}
