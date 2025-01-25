package assistedproblems.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        // Demonstrating polymorphism
        Animal[] animals = { dog, cat, bird };

        System.out.println("Demonstrating Animal Hierarchy:");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age);
            animal.makeSound(); // Polymorphism in action
        }
    }
}
