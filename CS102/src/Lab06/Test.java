package Lab06;

import java.util.ArrayList;

public class Test {
    public static void prepareFruits(ArrayList<Fruit> fruits) {
        fruits.forEach(fruit -> {
            if ((fruit instanceof Apple) | (fruit instanceof Banana)) {
                fruit.peel();
            }
            else {
                fruit.pick();
            }
        });
    }

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Banana());
        fruits.add(new Strawberry());
        fruits.add(new Blackberry());
        prepareFruits(fruits);
    }
}

