package Lab06;


public final class Banana extends Fruit implements TreeFruit{
    public Banana() {
        super();
        this.color = "yellow";
        this.vitamins = "C D";
    }

    public void peel() {
        System.out.println("Peeling a banana!");
    }
}
