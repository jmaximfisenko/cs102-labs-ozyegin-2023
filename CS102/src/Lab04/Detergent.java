package Lab04;

public class Detergent extends Cleaning {
    private float lts;
    private boolean liquid;

    public Detergent(String brand) {
        super(brand);
    }

    public Detergent(String brand, float lts, boolean liquid) {
        super(brand);
        this.lts = lts;
        this.liquid = liquid;
    }

    public void setLts(float lts) {
        this.lts = lts;
    }

    public void setLiquid(boolean liquid) {
        this.liquid = liquid;
    }

    public double calculateTotalPrice() {
        return this.lts * this.getPrice() * (1 + this.getTax())  / 100;
    }

    public String toString() {
        return super.toString() + "\nLts: " + this.lts + "\nLiquid: " + this.liquid;
    }
}
