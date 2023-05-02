package Lab04;

public class Test {
    public static void main(String[] args) {

        Cloth sweaters = new Cloth(18, "darkGrey", "A");
        sweaters.setName("sweaters");
        sweaters.setQuantity(2);
        sweaters.setPrice(0);
        System.out.println(sweaters);

        Trousers jeans = new Trousers(30, "blue", "B");
        jeans.setName("skinny jeans");
        jeans.setPrice(50.99f);
        System.out.println("\n" + jeans);

        Dairy milk = new Dairy(25, 1, true, "milk");
        milk.setPrice(2.95f);
        milk.setExpirationDate("09.11.2018");
        System.out.println("\n" + milk);

        Food pepper = new Food("pepper");
        System.out.println("\n" + pepper);

        Detergent tablet = new Detergent("C", 30, false);
        tablet.setName("tablet");
        System.out.println("\n" + tablet);

        Vegetable lemon = new Vegetable(15, 1, true, "lemon");
        lemon.setPrice(5.15f);
        lemon.setExpirationDate("19.11.2018");
        System.out.println("\n" + lemon);

        Dishwashing dishProduct = new Dishwashing("D");
        dishProduct.setName("Some other product");
        System.out.println("\n" + dishProduct);

        Meat chicken = new Meat(11, 1, "good");
        chicken.setName("chicken");
        System.out.println("\n" + chicken);

        Product someProduct = new Product(10, 10);
        someProduct.setName("someProduct");
        System.out.println("\n" + someProduct.getTax() + " " +
                someProduct.getPrice() + " " + someProduct.getName());

        Skirt skirt = new Skirt(1, "E", "red", 1, "skirt");
        System.out.println("\n" + skirt);
    }
}
