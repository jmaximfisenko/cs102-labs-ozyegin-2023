package Lab02;

public class DriverLicense {
    private final String driverName;
    private final int driverID;
    private final String expirationDate;
    private final String bloodType;
    private int penalty;
    private boolean status;
    private final int limit;

    public DriverLicense(String driverName, int driverID, String expirationDate, String bloodType) {
        this.driverName = driverName;
        this.driverID = driverID;
        this.expirationDate = expirationDate;
        this.bloodType = bloodType;
        this.penalty = 0;
        this.status = true;
        this.limit = 100;
    }

    public void increasePenalty(int points) {
        if (points > 0) {
            this.penalty = this.penalty + points;
            this.setStatus();
        } else {
            System.out.println("Number of points should be more than 0!");
        }
    }

    public void decreasePenalty(int points) {
        if (points > 0) {
            this.penalty = this.penalty - points;
            this.setStatus();
        } else {
            System.out.println("Number of points should be more than 0!");
        }
    }

    private void setStatus() {
        if ((this.penalty > this.limit) && (this.status)) {
            this.status = false;
        } else if ((this.penalty < this.limit) && (!this.status)) {
            this.status = true;
        }
    }

    // getters
    public String getDriverName() {
        return this.driverName;
    }

    public int getDriverID() {
        return this.driverID;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public int getPenalty() {
        return this.penalty;
    }

    public boolean getStatus() {
        return this.status;
    }

    // setters
    public void setPenalty(int points) {
        if (points >= 0) {
            this.penalty = points;
            this.setStatus();
        } else {
            System.out.println("Number of points should be more or equal than 0!");
        }
    }

    // print all the information
    public String toString() {
        String statusToPrint;
        if (this.status) {
            statusToPrint = "Active";
        }
        else {
            statusToPrint = "Suspended";
        }
        return "Driver Name: " + this.driverName + "\n" +
                "Driver ID: " + this.driverID + "\n" +
                "Expiration Date: " + this.expirationDate + "\n" +
                "Blood Type: " + this.bloodType + "\n" +
                "Penalty: " + this.penalty + "\n" +
                "Status: " + statusToPrint;
    }
}
