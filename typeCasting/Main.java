package typeCasting;

public class Main {
    public static void main(String[] args) {
        // Up casting

        Animal animal = new Dog("Rufus");
        animal.makeSound();

        // Down casting

        Dog dog = (Dog) animal;
        dog.fetch();
    }
}
