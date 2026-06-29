import java.util.Scanner;

public class runtime_poly {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Animal_runtime_poly animal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for Dog, 2 for Cat: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog_runtime_poly();
        } else {
            animal = new Cat_runtime_poly();
        }

        animal.speak();

        scanner.close();
    }
}
abstract class Animal_runtime_poly{

    abstract void speak();
}

class Dog_runtime_poly extends Animal_runtime_poly{

    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat_runtime_poly extends Animal_runtime_poly{

    @Override
    void speak() {
        System.out.println("Meow!");
    }
}