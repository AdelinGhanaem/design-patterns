package com.visitor;

public class Book implements ItemElement{

	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getIsbnNumber() {
		return this.isbnNumber;
	}
	
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
