package ua.com.kosovan.bookset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.kosovan.bookset.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
