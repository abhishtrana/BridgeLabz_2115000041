public class Vehicle {
    // Static variable for registration fee common for all vehicles
    private static double registrationFee = 200.0; // Default registration fee

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Final variable to uniquely identify the registration number (cannot be changed)
    private final String registrationNumber;

    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber; // registrationNumber is final
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle registration details if the object is an instance of Vehicle
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("The provided object is not an instance of Vehicle.");
        }
    }

    // Static method to display the current registration fee
    public static void displayRegistrationFee() {
        System.out.println("Current Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        // Create some vehicles
        Vehicle vehicle1 = new Vehicle("ABC123", "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("XYZ456", "Jane Smith", "Motorcycle");

        // Display the current registration fee
        Vehicle.displayRegistrationFee();

        // Display registration details for both vehicles
        vehicle1.displayRegistrationDetails(vehicle1); // Should print vehicle1 details
        vehicle2.displayRegistrationDetails(vehicle2); // Should print vehicle2 details

        // Update the registration fee and display vehicle details again
        Vehicle.updateRegistrationFee(250.0);
        System.out.println("\nUpdated Registration Fee:\n");
        Vehicle.displayRegistrationFee();
        vehicle1.displayRegistrationDetails(vehicle1); // Should print vehicle1 details with updated fee
        vehicle2.displayRegistrationDetails(vehicle2); // Should print vehicle2 details with updated fee
    }
}
