package ua.com.kosovan.bookset.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.com.kosovan.bookset.dao.BookDao;
import ua.com.kosovan.bookset.entity.Book;
import ua.com.kosovan.bookset.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;

	@Override
	public void save(Book book) {
		bookDao.save(book);
	}

	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public Book findOne(int id) {
		return bookDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		bookDao.delete(id);
	}
	
	public Page<Book> findAll(int currentPage, int numberOfItem) {

		List<Book> books = bookDao.findAll();

		Pageable pageable = new PageRequest(currentPage, numberOfItem);

		return bookDao.findAll(pageable);

	}
	
}
