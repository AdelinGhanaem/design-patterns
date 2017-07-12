package flyweight;

public class Coffee implements ICoffee{
	
	private final String flavor;
	 
    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }
 
    public String getFlavor() {
        return this.flavor;
    }

	@Override
	public void beServed(CoffeeContext context) {
		System.out.println("Serving " + flavor + " to table " + context.getTable());
	}

}
