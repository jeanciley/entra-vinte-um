package POO.polimorfismo.exemplo1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        animal.makeSound();

    }
}
