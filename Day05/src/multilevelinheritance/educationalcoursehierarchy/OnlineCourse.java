package multilevelinheritance.educationalcoursehierarchy;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayDetails to include online course details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
