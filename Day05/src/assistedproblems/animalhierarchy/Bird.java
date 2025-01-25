package assistedproblems.animalhierarchy;

class Bird extends Animal {

    // Constructor for Bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " the Bird says: Chirp! Chirp!");
    }
}