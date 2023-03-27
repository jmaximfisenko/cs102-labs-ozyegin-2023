package Lab02;

public class DriverLicenseTest {
    public static void main(String[] args) {

        DriverLicense license1 = new DriverLicense("Maksim Fisenko",
                123456, "12-12-2024", "AB");

        DriverLicense license2 = new DriverLicense("Mehmet",
                999999, "01-01-2031", "A");

        System.out.println("==Initially==\n" + license1);
        license1.increasePenalty(105);
        license1.decreasePenalty(2);

        System.out.println("==After increasing penalty==\n" + license1);

        // the same output but with the getters
        System.out.println("\n==License 1 Driver name: " + license1.getDriverName());
        System.out.println("==License 1 Driver ID: " + license1.getDriverID());
        System.out.println("==License 1 Expiration date: " + license1.getExpirationDate());
        System.out.println("==License 1 Blood type: " + license1.getBloodType());
        System.out.println("==License 1 Penalty: " + license1.getPenalty());
        System.out.println("==License 1 Status: " + license1.getStatus());

        System.out.println("==Trying to set penalty to -10==");
        license2.setPenalty(-10);
        System.out.println("\n" + license2);

    }
}
