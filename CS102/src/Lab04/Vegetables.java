package Lab04;

public class Vegetables extends Food{
    boolean organic;

    public Vegetables(float tax, float kgs, boolean organic, String name) {
        super(tax, kgs);
        setName(name);
        this.organic = organic;
    }

    public String toString() {
        return super.toString() + "\nOrganic: " + this.organic;
    }
}
