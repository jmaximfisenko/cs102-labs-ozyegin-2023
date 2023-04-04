package Lab04;

public class Skirt extends Cloth{
    public Skirt(int quantity, String brand, String color, float tax, String name) {
        super(tax, color, brand);
        setQuantity(quantity);
        setName(name);
    }

    public String toString() {
        return super.toString();
    }
}
