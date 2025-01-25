package multilevelinheritance.educationalcoursehierarchy;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // as a percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the final fee after discount
    private double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    // Overriding displayDetails to include fee details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}
