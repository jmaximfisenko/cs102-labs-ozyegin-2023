package Lab01;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Ford", "black");
        Car car3 = new Car("Nissan", "green");

        car1.decrementGear();
        car1.incrementGear();

        car2.setGear(6);
        car2.setGear(5);

        car3.incrementGear();
        car3.incrementGear();

        System.out.println("\nCar1 brand: " + car1.getBrand());
        System.out.println("Car2 color: " + car2.getColor());
        System.out.println("Car3 gear: " + car3.getGear());

        car1.drive(2, 30);
        car1.drive(3, 60);
        System.out.println("Car1 odometer: " + car1.getOdometer());
        System.out.println("Car1 total number of hours: " + car1.getTotalHours());
        System.out.println("Car1 average speed: " + car1.getAvgSpeed());

        System.out.println("\nCar1 info:");
        car1.display();
    }
}
