package Lab06;


public final class Blackberry extends Fruit implements GroundFruit{
    public Blackberry() {
        super();
        this.color = "black";
        this.vitamins = "C K";
    }

    public void pick() {
        System.out.println("Picking a blackberry!");
    }
}
