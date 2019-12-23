package ichinohe.application.bookmanagementsystem.api.delete;

import ichinohe.application.bookmanagementsystem.domain.core.Result;
import ichinohe.application.bookmanagementsystem.domain.delete.BookDeleteApplication;
import ichinohe.application.bookmanagementsystem.service.delete.BookDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookDeleteApi {
    @Autowired
    private BookDeleteService service;



    @RequestMapping(value = "/book-delete", method = RequestMethod.POST)
    public String apply(BookDeleteRequest request, Model model) {
        BookDeleteApplication application = request.createApplication();
        Result result = service.delete(application);
        model.addAttribute("message",result.getResult());
        return "delete";
    }

    @RequestMapping(value = "/book-delete-view", method = RequestMethod.GET)
    public String entryView() {
        return "delete";
    }
}
