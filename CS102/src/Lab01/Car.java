package Lab01;

public class Car {
    private float odometer;
    private final String brand;
    private final String color;
    private int gear;
    private float totalHours;
    private float avgSpeed;

    public Car(String brand) {
        this.brand = brand;
        this.color = "unknown";
        this.odometer = 0;
        this.gear = 0;
        this.totalHours = 0;
        this.avgSpeed = 0;
    }

    // constructors overloading
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.odometer = 0;
        this.gear = 0;
    }

    public void incrementGear() {
        if (this.gear + 1 <= 5) {
            this.gear += 1;
        }
        else {
            System.out.println("Error! A gear cannot be more than 5");
        }
    }

    public void decrementGear() {
        if (this.gear - 1 < 0) {
            this.gear -= 1;
        }
        else {
            System.out.println("Error! A gear cannot be less than 0!");
        }
    }

    public void drive(float numOfHours, float speed) {
        this.odometer += numOfHours * speed;
        this.totalHours += numOfHours;
        this.avgSpeed = this.odometer / this.totalHours;
    }

    public int getGear() {
        return this.gear;
    }

    public float getOdometer() {
        return this.odometer;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public float getTotalHours() {
        return this.totalHours;
    }

    public float getAvgSpeed() {
        return this.avgSpeed;
    }

    public void setGear(int gear) {
        if (gear <= 5 && gear >= 0) {
            this.gear = gear;
        }
        else {
            System.out.println("Error! A gear should be a value only from 0 to 5 range.");
        }
    }

    public void display() {
        System.out.println("Brand: " + this.brand + "\nColor: " + this.color + "\nOdometer: " +
                this.odometer + "\nGear: " + this.gear + "\nAverage Speed: " + this.avgSpeed);
    }

}
