import java.util.*;
import java.util.stream.Collectors;

public class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public void setPolicyholderName(String policyholderName) { this.policyholderName = policyholderName; }
    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
    public String getCoverageType() { return coverageType; }
    public void setCoverageType(String coverageType) { this.coverageType = coverageType; }
    public double getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(double premiumAmount) { this.premiumAmount = premiumAmount; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

public class PolicyManagementSystem {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    public Set<Policy> getPoliciesExpiringSoon() {
        Date today = new Date();
        Date in30Days = new Date(today.getTime() + (30L * 24 * 60 * 60 * 1000));
        return treeSet.stream()
                .filter(policy -> policy.getExpiryDate().after(today) && policy.getExpiryDate().before(in30Days))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        return hashSet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<String> policyNumbers = new HashSet<>();
        return hashSet.stream()
                .filter(policy -> !policyNumbers.add(policy.getPolicyNumber()))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getHashSet() {
        return hashSet;
    }

    public Set<Policy> getLinkedHashSet() {
        return linkedHashSet;
    }

    public Set<Policy> getTreeSet() {
        return treeSet;
    }
}

public class performanceComparision{
    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        Policy policy1 = new Policy("123", "John Doe", new Date(System.currentTimeMillis() + 86400000L), "Health", 1000.0);
        Policy policy2 = new Policy("124", "Jane Doe", new Date(System.currentTimeMillis() + 43200000L), "Auto", 1500.0);

        long startTime = System.nanoTime();
        system.addPolicy(policy1);
        long endTime = System.nanoTime();
        System.out.println("Time taken to add policy1: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        system.addPolicy(policy2);
        endTime = System.nanoTime();
        System.out.println("Time taken to add policy2: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        system.getHashSet().remove(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove policy1: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        system.getAllUniquePolicies();
        endTime = System.nanoTime();
        System.out.println("Time taken to search policies: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        system.getLinkedHashSet().remove(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove policy1 from LinkedHashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        system.getTreeSet().remove(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove policy1 from TreeSet: " + (endTime - startTime) + " ns");
    }
}
