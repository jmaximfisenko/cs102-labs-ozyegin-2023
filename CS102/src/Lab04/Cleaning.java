package Lab04;

public class Cleaning extends Product{
    private final String brand;

    public Cleaning(String brand) {
        super();
        this.brand = brand;
    }

    public String toString() {
        return super.toString() + "\nBrand: " + this.brand;
    }
}
