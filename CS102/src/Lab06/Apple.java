package Lab06;


public final class Apple extends Fruit implements TreeFruit{
    public Apple() {
        super();
        this.color = "green";
        this.vitamins = "A B12";
    }

    public void peel() {
        System.out.println("Peeling an apple!");
    }
}
