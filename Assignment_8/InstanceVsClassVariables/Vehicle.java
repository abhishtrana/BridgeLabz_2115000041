public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0; // Fixed for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to $" + registrationFee);
        } else {
            System.out.println("Invalid fee amount. Fee must be greater than 0.");
        }
    }

    // Getters and Setters (optional)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }
}
