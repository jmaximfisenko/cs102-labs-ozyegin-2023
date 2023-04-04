package Lab04;

public class Food extends Product {
    private float kgs;
    private String expirationDate;
    public Food(float tax, float kgs) {
        super(tax);
        this.kgs = kgs;

    }

    public Food(String name) {
        super();
        setExpirationDate("13.11.2018");
        setName(name);
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString() {
        return super.toString() + "\nKgs: " + this.kgs + "\nExpiration date: " + this.expirationDate;
    }
}
