package assistedproblems.animalhierarchy;

class Animal {
    String name;
    int age;

    // Constructor for Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
