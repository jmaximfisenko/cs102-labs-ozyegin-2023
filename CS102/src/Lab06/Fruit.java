package Lab06;


public abstract class Fruit implements TreeFruit, GroundFruit {
    public Fruit() {}
    protected String color;
    protected String vitamins;
    public String getVitamins() {
        return this.vitamins;
    }

    public void peel() {}
    public void pick() {}

}
