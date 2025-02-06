import java.util.ArrayList;

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalInfo() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void displayDoctors() {
        System.out.println("Patient " + name + "'s doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }
    }
}

public class HospitalInfo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");
        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");
        Patient charlie = new Patient("Charlie");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);
        hospital.addPatient(charlie);

        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(bob);
        drJones.consult(charlie);

        drSmith.displayPatients();
        drJones.displayPatients();
        alice.displayDoctors();
        bob.displayDoctors();
        charlie.displayDoctors();
    }
}
