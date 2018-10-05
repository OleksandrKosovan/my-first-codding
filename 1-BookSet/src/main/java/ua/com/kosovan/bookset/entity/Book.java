package ua.com.kosovan.bookset.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String link;
	private double price;
	private String linkWebSite;

	public Book() {
	}

	public Book(String name, String author, String link, double price, String linkWebSite) {
		super();
		this.name = name;
		this.author = author;
		this.link = link;
		this.price = price;
		this.linkWebSite = linkWebSite;
	}

	public String getLinkWebSite() {
		return linkWebSite;
	}

	public void setLinkWebSite(String linkWebSite) {
		this.linkWebSite = linkWebSite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
