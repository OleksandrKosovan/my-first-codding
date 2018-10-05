package ua.com.kosovan.bookset.dto;

import java.util.ArrayList;
import java.util.List;

import ua.com.kosovan.bookset.entity.Book;

public class DtoUtilMapper {

	public static List<BookDto> bookToBookDtos(List<Book> books) {
		List<BookDto> bookDtos = new ArrayList<BookDto>();
		for (Book book : books) {
			bookDtos.add(new BookDto(book.getName(), book.getAuthor(), book.getLink(), book.getPrice(),
					book.getLinkWebSite()));
		}
		return bookDtos;
	}

}
