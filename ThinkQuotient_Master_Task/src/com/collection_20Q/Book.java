package com.collection_20Q;

public class Book {
	int bid;
	String author;
	float price;
	
	
	public Book(int bid, String author, float price) {
		this.bid = bid;
		this.author = author;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [bid=" + bid + ", author=" + author + ", price=" + price + "]";
	}


}
