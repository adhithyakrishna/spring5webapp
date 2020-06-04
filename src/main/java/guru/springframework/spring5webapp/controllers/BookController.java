package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    //since this is a spring managed component, when it instantiates, it will inject an instance of book respository inside our controller
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    // from the diagram, we hav ethe controller, we have to bring in the model
    public String getBooks(Model model) // this is what is going to get returned to the view
    {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
