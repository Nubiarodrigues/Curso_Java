package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {

	private String title;
	private LocalDate datePublished;
	private Double price;
	private Author author;

	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Book() {
	}

	public Book(String title, LocalDate datePublished, Double price, Author author) {
		this.title = title;
		this.datePublished = datePublished;
		this.price = price;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Titulo: " + title + "\n" + "Ano de publicação: " + sdf.format(datePublished) + "\n" + "Autor: "
				+ author;

	}

}
