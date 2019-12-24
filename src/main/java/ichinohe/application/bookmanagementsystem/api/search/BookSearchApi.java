package ichinohe.application.bookmanagementsystem.api.search;

import ichinohe.application.bookmanagementsystem.api.alteration.BookAlterationSearchRequest;
import ichinohe.application.bookmanagementsystem.api.delete.BookDeleteSearchRequest;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import ichinohe.application.bookmanagementsystem.service.search.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 書籍検索API
 */
@Controller
public class BookSearchApi {
    @Autowired
    private BookSearchService searchService;

    @RequestMapping(value = "/book-search", method = RequestMethod.POST)
    public String apply(BookSearchRequest request, Model model) {
        BookSearchApplication application = request.createApplication();
        List<BookEntity> bookEntityList = searchService.search(application);
        model.addAttribute("bookEntityList", bookEntityList);
        return "search";
    }

    @RequestMapping(value = "/book-search-view", method = RequestMethod.GET)
    public String searchView() {
        return "search";
    }

    @RequestMapping(value = "/book-delete-search", method = RequestMethod.POST)
    public String apply(BookDeleteSearchRequest request, Model model) {
        BookSearchApplication application = request.createApplication();
        List<BookEntity> bookEntityList = searchService.search(application);
        model.addAttribute("bookEntityList", bookEntityList);
        return "delete";
    }

    @RequestMapping(value = "/book-alteration-search", method = RequestMethod.POST)
    public String apply(BookAlterationSearchRequest request, Model model) {
        BookSearchApplication application = request.createApplication();
        List<BookEntity> bookEntityList = searchService.search(application);
        model.addAttribute("bookEntityList", bookEntityList);
        return "alteration";
    }
}
