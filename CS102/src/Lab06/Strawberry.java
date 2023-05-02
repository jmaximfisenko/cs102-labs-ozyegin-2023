package Lab06;


public final class Strawberry extends Fruit implements GroundFruit{
    public Strawberry() {
        super();
        this.color = "red";
        this.vitamins = "B5 E";
    }

    public void pick() {
        System.out.println("Picking a strawberry!");
    }
}
