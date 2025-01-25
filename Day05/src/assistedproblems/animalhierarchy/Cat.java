package assistedproblems.animalhierarchy;

class Cat extends Animal {

    // Constructor for Cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " the Cat says: Meow!");
    }
}