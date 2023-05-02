package Lab05;

import Lab04.Cloth;
import Lab04.Dairy;
import Lab04.Dishwashing;
import Lab04.Food;
import Lab04.Trousers;
import Lab04.Vegetable;

public class Test {

	public static void main(String[] args) {
				
		Lab04.Cloth sweaters = new Cloth(20, "darkGray", "A");
		sweaters.setTax(18);
		sweaters.setName("sweaters");
		sweaters.setQuantity(2);

		Lab04.Trousers jean = new Trousers(30, "blue", "B");
		jean.setPrice(50.99);
		jean.setName("skinny jean");
		jean.setQuantity(0);

		Lab04.Dairy milk = new Dairy(25, 1, true, "milk");
	    milk.setExpirationDate("09.11.2018");
	    milk.setPrice(2.95);
	
	    Lab04.Food pepper = new Food("pepper");
	    
	    Dishwashing tablet = new Dishwashing("C");
	    tablet.setLts(30);
	    tablet.setLiquid(false);
	    tablet.setName("tablet");
	    
	    Vegetable lemon = new Vegetable(15, 1, true, "lemon");
	    lemon.setExpirationDate("19.11.2018");
	    lemon.setPrice(5.15);

		double calculateTotalPrice = sweaters.calculateTotalPrice() + jean.calculateTotalPrice() +
				milk.calculateTotalPrice() + tablet.calculateTotalPrice() + lemon.calculateTotalPrice();

		System.out.println(
				"Purchased Cloth Items\n\n" + sweaters + "\n\n" + jean + "\n\n-------------------------------\n" + "Purchased Detergent Items\n\n"
						+ tablet + "\n\n-------------------------------\n" + "Purchased Food Items\n\n" + milk + "\n\n" + pepper + "\n\n" +
						lemon + "\n\n-------------------------------\n" + "Total is " + calculateTotalPrice
		);

	}
}
