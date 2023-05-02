package Lab04;

public class Cloth extends Product{
    private final String color;
    private final String brand;
    private int quantity = 0;
    public Cloth(float tax, String color, String brand) {
        setTax(tax);
        this.color = color;
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return this.quantity * this.getPrice() * (1 + this.getTax() / 100);
    }

    public String toString() {
        return super.toString() + "\nBrand: " + this.brand + "\nColor: " + this.color +
                "\nQuantity: " + this.quantity;
    }
}
