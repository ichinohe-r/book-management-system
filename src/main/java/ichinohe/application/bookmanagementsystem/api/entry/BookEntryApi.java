package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.domain.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.entry.ReceiptDateTime;
import ichinohe.application.bookmanagementsystem.service.entry.BookEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 書籍登録API
 */
@Controller
public class BookEntryApi {

    @Autowired
    private BookEntryService service;

    public static final String URI = "/book-entry";
    public static final String NAME = "書籍情報登録API";

    @RequestMapping(value = URI, method = RequestMethod.GET)
    public String apply(BookEntryRequestForms request, Model model) {
        BookEntryApplication application = request.createApplication(ReceiptDateTime.create());
        Result result = service.entry(application);
        model.addAttribute("message", result.getResult());
        return "index";
    }
}
