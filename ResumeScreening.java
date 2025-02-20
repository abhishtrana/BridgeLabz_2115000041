import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void displayResume() {
        System.out.println("Processing resume for: " + jobRole.getTitle());
    }
}

public class ResumeScreening {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Screening resume for: " + resume.getTitle());
        }
    }

    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer());
        resumes.add(new DataScientist());

        processResumes(resumes);
    }
}
