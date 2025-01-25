package assistedproblems.animalhierarchy;

class Dog extends Animal {

        // Constructor for Dog
        public Dog(String name, int age) {
            super(name, age);
        }

        // Overriding the makeSound method
        @Override
        public void makeSound() {
            System.out.println(name + " the Dog says: Woof! Woof!");
        }
    }
