package ua.com.kosovan.bookset.service;

import java.io.IOException;

import ua.com.kosovan.bookset.entity.Book;

public interface PageParserService {

	Book parserBookClub(int numbers_pages, int q, String linkpage) throws IOException;
	
	
	
}
