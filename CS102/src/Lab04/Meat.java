package Lab04;

public class Meat extends Food{
    String quality;

    public Meat(float tax, float kgs, String quality) {
        super(tax, kgs);
        this.quality = quality;
    }

    public String toString() {
        return super.toString() + "\nQuality: " + this.quality;
    }
}
