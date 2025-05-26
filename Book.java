package com.book;
import com.publisher.Publisher;
public class Book {
	private String title;
	private String author;
	private Publisher publisher;
	private double price;
	
	private Book(String title, String author, Publisher publisher, double price) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
    public Publisher getpublisher() {
    	return publisher;
    }
    public double getPrice() {
    	return price;
    }
    public void setTitle(String title) {
    	this.title=title;
    }
    public void setAuthor(String author) {
    	this.author=author;
    }
    public void setPublisher(Publisher publisher) {
    	this.publisher=publisher;
    }
    public void setPrice(double price) {
    	this.price=price;
    }
    public String toString() {
    	return "Book[Book title="+title+", Book Author="+author+", Book Publisher="+publisher+", Book Price="+price+"]";
    }
    public static Book getBookObject(String title, String author, Publisher publisher, double price) {
    	if(title.isEmpty() && author.isEmpty() && title==null && author==null && price>=50 && price <=1000) {
    		return null;
    	}
    	return new Book(title, author, publisher, price);
    }	
    }

