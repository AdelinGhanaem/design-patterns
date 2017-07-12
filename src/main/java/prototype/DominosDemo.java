package prototype;

public class DominosDemo {

	public static void main(String[] args) {

		Pizza prototype = new Pizza();
		prototype.loadData();
		
		try {
			Pizza order1 = (Pizza) prototype.clone();
			System.out.println("---prototype---");
			System.out.println(order1);
			order1.addIngredients("tomatoes", "cheese");
			System.out.println("---order 1---");
			System.out.println(order1);
			Pizza order2 = (Pizza) prototype.clone();
			order2.addIngredients("ham", "mushrooms", "peppers", "black olives", "cheese");
			System.out.println("---order 2---");
			System.out.println(order2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}
