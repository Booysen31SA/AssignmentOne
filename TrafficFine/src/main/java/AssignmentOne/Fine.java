package AssignmentOne;

public class Fine {

    private String licenseNumber;
    private String vehicle;
    private double fineAmount;

    public Fine(String licenseNumber, String vehicle, double fineAmount) {
        this.licenseNumber = licenseNumber;
        this.vehicle = vehicle;
        if(fineAmount < 0)
            throw new IllegalArgumentException("Err");
           this.fineAmount = fineAmount;
    }

    public Fine() {
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
}
