package Lab04;

public class Product {
    private float tax;
    private double price;
    private String name = "no name";

    // constructors
    public Product() {
        this.tax = 18;
        this.price = 1;
    }

    public Product(float tax) {
        this.tax = tax;
    }

    public Product(float tax, float price) {
        this.tax = tax;
        this.price = price;
    }

    // getters
    public float getTax() {
        return this.tax;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    // setters
    public void setTax(float tax) {
        this.tax = tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // overriding toString()
    public String toString() {
        return "Name: " + this.name + "\nTax rate: " + this.tax + "\nPrice: " + this.price;
    }
}
