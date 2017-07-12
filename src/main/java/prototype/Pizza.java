package prototype;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza implements Cloneable{
	
	private List<Object> ingredients;
	
	public Pizza() {
		this.ingredients = new ArrayList<>();
	}
	
	public void loadData(){
		//take all bread ingredients from database and create a bread
		this.ingredients.add(new Flatbread());
	}

	public List<Object> getIngredients() {
		return ingredients;
	}

	public void addIngredients(Object... ingredients) {
		for (Object object : ingredients) {
			this.ingredients.add(object);
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Pizza pizza = new Pizza();
		for (Object object : this.ingredients) {
			pizza.addIngredients(object);
		}
		return pizza;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.ingredients.toArray());
	}
	
	

	
}
