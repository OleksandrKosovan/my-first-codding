package ua.com.kosovan.bookset.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParserTest {

	public static void main(String[] args) throws IOException {
		
		
		
		Document document = Jsoup.connect("https://www.bookclub.ua/ukr/catalog/books/?listmode=2").get();
		Element element = document.body();
		
		

		Elements price = element.select("td[class='mpriceAct'");
		
		
		
		System.out.println(price);
		
		
		
		/*System.out.println("_______________________");
		
		String forarray = elements1.get(0).html();
		String test [] = forarray.split(" ");
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}	*/	
		
		
		/*List<String> elem =new ArrayList<String>();
		
		for (int i = 0; i < 20; i++) {
			elem.add(elements1.get(i).html());
			System.out.println(elem.get(i));
		}
		
		elem.add(elements1.get(0).html());
		System.out.println(elem.get(0));*/
		
		
		/*String str = element.html();
		
		
		File file = new File("file.html");
		file.createNewFile();
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(str);
		bufferedWriter.close();*/
		
		//String srr = element.html();
		//Elements element_author  = element.select("div[class='authorName']");
		//String author = element_author.text();
		//System.out.println(element);
		//System.err.println(author);
		/*FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(srr);
		bufferedWriter.close();*/
	}
}
