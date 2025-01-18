public class Student {
  // Attributes of Student class
  String name;
  int rollNumber;
  double marks;
  
  // Constructor to initialize the Studemt object
  public Student(String name, int rollNumber, double marks){
    this.name=name;
	this.rollNumber=rollNumber;
	this.marks=marks;
  }
  
  // Method to calulate grade based on marks
  public String calculateGrade(){
     if(marks >= 90){
	 return "A";
	 } else if(marks >= 80){
	 return "B";
	 } else if(marks >= 70){
	 return "C";
	 } else if(marks >= 60){
	 return "D";
	 } else {
	 return "F";
	 }
  }
  
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    
	// Main method
	 public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Alice", 101, 85.5);
        Student student2 = new Student("Bob", 102, 72.0);
        Student student3 = new Student("Charlie", 103, 59.0);

        // Displaying details for each student
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student3.displayDetails();
    }
}