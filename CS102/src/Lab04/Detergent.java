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

    public String toString() {
        return super.toString() + "\nLts: " + this.lts + "\nLiquid: " + this.liquid;
    }
}
