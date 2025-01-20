public class Person {
    // Attributes
    String name;
    int age;
    String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating a person object using the parameterized constructor
        Person originalPerson = new Person("John Doe", 30, "123 Main St");

        // Creating a copy of the original person using the copy constructor
        Person clonedPerson = new Person(originalPerson);

        // Displaying the details of the original and cloned persons
        System.out.println("Original Person Details:");
        originalPerson.displayPersonDetails();

        System.out.println("\nCloned Person Details:");
        clonedPerson.displayPersonDetails();
    }
}
