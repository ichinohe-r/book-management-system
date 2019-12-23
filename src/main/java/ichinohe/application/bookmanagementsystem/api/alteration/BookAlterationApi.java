package ichinohe.application.bookmanagementsystem.api.alteration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookAlterationApi {

    @RequestMapping(value = "/book-alteration-view", method = RequestMethod.GET)
    public String entryView() {
        return "alteration";
    }
}
