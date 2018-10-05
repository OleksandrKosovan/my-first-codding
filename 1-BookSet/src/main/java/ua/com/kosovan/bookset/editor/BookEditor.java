package ua.com.kosovan.bookset.editor;

import java.beans.PropertyEditorSupport;

import ua.com.kosovan.bookset.service.BookService;

public class BookEditor extends PropertyEditorSupport {

	private final BookService bookService;

	public BookEditor(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(bookService.findOne(Integer.parseInt(text)));
	}

}
