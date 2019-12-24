package ichinohe.application.bookmanagementsystem.api.alteration;

import ichinohe.application.bookmanagementsystem.domain.alteration.BookAlterationApplication;
import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.service.alteration.BookAlterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookAlterationApi {
    @Autowired
    private BookAlterationService service;

    @RequestMapping(value = "/book-alteration", method = RequestMethod.POST)
    public String apply(BookAlterationRequest request, Model model) {
        BookAlterationApplication application = request.createApplication();
        Result result = service.alteration(application);
        model.addAttribute("message", result.getResult());
        return "alteration";
    }

    @RequestMapping(value = "/book-alteration-view", method = RequestMethod.GET)
    public String entryView() {
        return "alteration";
    }
}
