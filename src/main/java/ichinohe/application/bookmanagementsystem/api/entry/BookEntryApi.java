package ichinohe.application.bookmanagementsystem.api.entry;

import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.domain.entry.BookEntryApplication;
import ichinohe.application.bookmanagementsystem.domain.core.ReceiptDateTime;
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

    @RequestMapping(value = "/book-entry", method = RequestMethod.POST)
    public String apply(BookEntryRequest request, Model model) {
        BookEntryApplication application = request.createApplication(ReceiptDateTime.create());
        Result result = service.entry(application);
        model.addAttribute("message", result.getResult());
        return "entry";
    }

    @RequestMapping(value = "/book-entry-view", method = RequestMethod.GET)
    public String entryView() {
        return "entry";
    }
}
