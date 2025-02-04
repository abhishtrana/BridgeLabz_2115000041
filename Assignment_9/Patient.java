public class Patient {
    // Static variable for hospital name, shared among all patients
    private static String hospitalName = "City General Hospital";

    // Static variable to keep track of total patients admitted
    private static int totalPatients = 0;

    // Final variable to uniquely identify each patient (patientID cannot be changed)
    private final String patientID;

    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;  // patientID is final, so it can only be assigned once
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;  // Increment total patients count when a new patient is created
    }

    // Static method to display the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Method to display patient details if the object is an instance of Patient
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("The provided object is not an instance of Patient.");
        }
    }

    // Static method to display the hospital name
    public static void displayHospitalName() {
        System.out.println("Hospital: " + hospitalName);
    }

    public static void main(String[] args) {
        // Create some patients
        Patient patient1 = new Patient("P001", "John Doe", 45, "Fever");
        Patient patient2 = new Patient("P002", "Jane Smith", 30, "Cough");

        // Display total patients admitted
        Patient.getTotalPatients();

        // Display patient details
        patient1.displayPatientDetails(patient1);  // Should print patient1 details
        patient2.displayPatientDetails(patient2);  // Should print patient2 details

        // Display hospital name
        Patient.displayHospitalName();
    }
}
