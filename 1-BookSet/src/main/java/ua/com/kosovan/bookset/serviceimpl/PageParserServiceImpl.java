package ua.com.kosovan.bookset.serviceimpl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import ua.com.kosovan.bookset.entity.Book;
import ua.com.kosovan.bookset.service.PageParserService;

@Service
public class PageParserServiceImpl implements PageParserService {

	/**
	 * Algorithms parser for "Book club"
	 * 
	 * @throws IOException
	 */

	@Override
	public Book parserBookClub(int numbers_pages, int q, String linkpage) throws IOException {
		String name = "";
		String author = "";
		String link = "https://www.bookclub.ua";
		double price;
		String linkWebSite = "https://www.bookclub.ua";

		Book book;

		Document document = Jsoup.connect(linkpage).get();
		Element element = document.body();

		Elements elements = element.select("table[class='goodsList']").select("div[style='position: relative']")
				.select("a[onclick]");

		Elements priceEl = element.select("td[class='mpriceAct'");

		String title = elements.get(q).attr("title");
		String href = elements.get(q).attr("href");

		price = Double.valueOf(priceEl.get(q).text());
		link += href;

		String array[] = title.split(" ");

		int i = 0;
		while (!array[i].equals("-")) {
			name += array[i];
			name += " ";
			i++;
		}
		i++;

		while (i != array.length - 3) {
			author += array[i];
			author += " ";
			i++;
		}
		book = new Book(name, author, link, price, linkWebSite);

		return book;
	}

}
