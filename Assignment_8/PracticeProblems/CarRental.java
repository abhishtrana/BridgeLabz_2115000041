public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double COST_PER_DAY = 50.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    public void display() {
        System.out
                .println("Customer: " + customerName + ", Car: " + carModel + ", Total Cost: $" + calculateTotalCost());
    }
}
