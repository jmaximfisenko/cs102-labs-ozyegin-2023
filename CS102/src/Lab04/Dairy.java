package Lab04;

public class Dairy extends Food{
    boolean pasteurized;

    public Dairy(float tax, float kgs, boolean pasteurized, String name) {
        super(tax, kgs);
        setName(name);
        this.pasteurized = pasteurized;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPasteurized: " + this.pasteurized;
    }
}
