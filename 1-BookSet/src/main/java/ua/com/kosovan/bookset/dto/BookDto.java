package ua.com.kosovan.bookset.dto;

public class BookDto {

	private String name;
	private String author;
	private String link;
	private double price;
	private String linkWebSite;

	public BookDto() {
	}

	public BookDto(String name, String author, String link, double price, String linkWebSite) {
		super();
		this.name = name;
		this.author = author;
		this.link = link;
		this.price = price;
		this.linkWebSite = linkWebSite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLinkWebSite() {
		return linkWebSite;
	}

	public void setLinkWebSite(String linkWebSite) {
		this.linkWebSite = linkWebSite;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
