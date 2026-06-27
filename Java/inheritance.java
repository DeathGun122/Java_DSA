public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

        System.out.println("Dog has " + dog.lives + " lives left.");
        System.out.println("Cat has " + cat.lives + " lives left.");

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        Plant plant = new Plant();
        plant.photosynthesis();
    }
}
class Organism{
    boolean isAlive;

    Organism(){
        isAlive = true;
    }

}

class Plant extends Organism{
    void photosynthesis(){
        System.out.println("The plant is photosynthesizing.");
    }
}

class Animal extends Organism{

    void eat(){
        System.out.println("The animal is eating.");
    }
}
class Dog extends Animal{
    int lives = 1;

    void speak(){
        System.out.println("Woof!");
    }
}
class Cat extends Animal{
    int lives = 9;

    void speak(){
        System.out.println("Meow!");
    }
}