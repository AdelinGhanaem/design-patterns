package com.visitor;

public class Demo {

	public static void main(String[] args) {

		ItemElement[] items = new ItemElement[] { new Book(20, "1234"), new Book(200, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };
		int total = calculatePrices(items);
		System.out.println("Total cost = " + total);
	}

	private static int calculatePrices(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}
}
