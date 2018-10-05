package ua.com.kosovan.bookset.service;

import java.util.List;

import org.springframework.data.domain.Page;

import ua.com.kosovan.bookset.entity.Book;

public interface BookService {

	void save(Book book);

	List<Book> findAll();

	Book findOne(int id);

	void delete(int id);
	
	Page<Book> findAll(int currentPage, int numberOfItem);

}
