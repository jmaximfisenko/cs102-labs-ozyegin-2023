package Lab04;

public class Vegetable extends Food{
    boolean organic;

    public Vegetable(float tax, float kgs, boolean organic, String name) {
        super(tax, kgs);
        setName(name);
        this.organic = organic;
    }

    public String toString() {
        return super.toString() + "\nOrganic: " + this.organic;
    }
}
