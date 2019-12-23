package ichinohe.application.bookmanagementsystem.api.search;

import ichinohe.application.bookmanagementsystem.domain.core.Author;
import ichinohe.application.bookmanagementsystem.domain.core.BookEntity;
import ichinohe.application.bookmanagementsystem.domain.core.BookManagementNumber;
import ichinohe.application.bookmanagementsystem.domain.core.BookTitle;
import ichinohe.application.bookmanagementsystem.domain.core.Publisher;
import ichinohe.application.bookmanagementsystem.domain.search.BookSearchApplication;
import ichinohe.application.bookmanagementsystem.service.search.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 書籍検索API
 */
@Controller
public class BookSearchApi {
    @Autowired
    BookSearchService service;

    @RequestMapping(value = "/book-search", method = RequestMethod.POST)
    public String apply(BookSearchRequest request, Model model) {
        BookSearchApplication application = request.createApplication();
        List<BookEntity> bookEntityList = service.search(application);

//        List<BookEntity> bookEntityList = new ArrayList<BookEntity>();
//        bookEntityList.add(new BookEntity(new BookManagementNumber(1) , new Author("Miura"), new BookTitle("Kazuyoshi"), new Publisher("未来")));
//        bookEntityList.add(new BookEntity(new BookManagementNumber(2) , new Author("Kitazawa"), new BookTitle("Tsuyoshi"), new Publisher("未来")));
//        bookEntityList.add(new BookEntity(new BookManagementNumber(3) , new Author("Hashiratani"), new BookTitle("Tetsuji"), new Publisher("未来")));
        model.addAttribute("bookEntityList", bookEntityList);

        return "search";
    }

    @RequestMapping(value = "/book-search-view", method = RequestMethod.GET)
    public String searchView() {
        return "search";
    }
}
