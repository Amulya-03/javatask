package com.main;
import com.book.Book;
import com.publisher.Publisher;

public class Main2 {
	public static void main(String[] args) {
		Publisher p=Publisher.getPublisherObject("Vijay", "Hyd", "p1654");
		Book b=Book.getBookObject("I wish I was an Extrovert", "Ajay", p, 400);
		if(b==null&&p==null) {
			System.out.println("Book creation is failed due to invalid data");
		}
		else {
			System.out.println(p);
			System.out.println(b);
		}
	}
	
	

}
