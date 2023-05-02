package Lab05;

import Lab04.Cleaning;

public class Soap extends Cleaning {
    private final int quantity;
    public Soap(String brand, int quantity) {
        super(brand);
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return this.quantity * this.getPrice() * (1 + this.getTax()) / 100;
    }
}
