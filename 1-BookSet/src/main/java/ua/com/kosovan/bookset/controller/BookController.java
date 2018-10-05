package ua.com.kosovan.bookset.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.com.kosovan.bookset.dto.BookDto;
import ua.com.kosovan.bookset.dto.DtoUtilMapper;
import ua.com.kosovan.bookset.entity.Book;
import ua.com.kosovan.bookset.service.BookService;
import ua.com.kosovan.bookset.service.PageParserService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private PageParserService pageParserService;

	@GetMapping("/addBook")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		return "views-admin-addBook";
	}

	@PostMapping("/addBook")
	public String newBook(@ModelAttribute Book book) {
		bookService.save(book);
		return "redirect:/addBook";
	}

	@GetMapping("/addBookParser")
	public String addBookParser() {
		return "views-admin-addBookParser";
	}

	@PostMapping("/addBookParser")
	public String newBookParser(@RequestParam int numbers_pages) throws IOException {
		for (int i = 0; i < numbers_pages * 20; i += 20) {
			String linkpage = "https://www.bookclub.ua/ukr/catalog/books/?i=" + i + "&listmode=2";
			for (int q = 0; q < 20; q++) {
				bookService.save(pageParserService.parserBookClub(numbers_pages, q, linkpage));
			}
		}
		return "redirect:/addBookParser";
	}

	@GetMapping("/shop")
	public String shop(Model model) {

		Page<Book> books = bookService.findAll(0, 5);

		String pages = "";

		for (int i = 0; i < books.getTotalPages(); i++) {

			pages += i + "-";

		}
		// 0-1-2-3-4-5-6

		model.addAttribute("totalPages", books.getTotalPages());

		model.addAttribute("pages", pages);
		model.addAttribute("books", books);

		// model.addAttribute("books",
		// DtoUtilMapper.bookToBookDtos(bookService.findAll()));
		return "views-shop-shop";
	}

	@GetMapping("/pageable/{currentPage}/{totalElement}")
	public String pageable(@PathVariable int currentPage, @PathVariable int totalElement, Model model) {

		Page<Book> books = bookService.findAll(currentPage, totalElement);

		List<BookDto> bookDTOS = DtoUtilMapper.bookToBookDtos(books.getContent());

		String pages = "";

		for (int i = 0; i < books.getTotalPages(); i++) {

			pages += i + "-";
		}

		model.addAttribute("totalPages", books.getTotalPages());

		model.addAttribute("pages", pages);

		model.addAttribute("books", books);

		return "views-shop-shop";
	}

	@RequestMapping(value = "/loadBooks", method = RequestMethod.POST)
	public @ResponseBody String loadBooks() {

		Page<Book> books = bookService.findAll(0, 5);

		return String.valueOf(books.getTotalPages());
	}

}
