class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    protected String breed;

    public void bark() {
        System.out.println(name + " the " + breed + " is barking");
    }
}

public class homework_array {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.breed = "Golden Retriever";

        dog.eat();
        dog.bark();
    }
}