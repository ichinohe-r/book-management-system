package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.domain.entry.受付日時;
import ichinohe.application.bookmanagementsystem.domain.entry.書籍登録申込書;
import ichinohe.application.bookmanagementsystem.service.entry.Book登録Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class 書籍情報登録API {

    @Autowired
    private Book登録Service service;

    public static final String URI = "/book-entry";
    public static final String NAME = "書籍情報登録API";

    @RequestMapping(value = URI, method = RequestMethod.GET)
    public String apply(書籍情報登録RequestForms request, Model model) {

        書籍登録申込書 application = request.createApplication(受付日時.create());

        service.entry(application);

        model.addAttribute("message", "書籍『" + application.getBookTitle().getValue() + "』を登録しました。");

        return "index";
    }
}
