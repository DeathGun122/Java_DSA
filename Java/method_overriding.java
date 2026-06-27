public class method_overriding {
    public static void main(String[] args) {
        
        Dog_MO dog = new Dog_MO();
        Cat_MO cat = new Cat_MO();
        Fish_MO fish = new Fish_MO();

        dog.move();
        cat.move();
        fish.move();

    }
}

class Animal_MO{

    void move(){
        System.out.println("This animal is running.");
    }
}

class Dog_MO extends Animal_MO{

}

class Cat_MO extends Animal_MO{

}

class Fish_MO extends Animal_MO{

    @Override
    void move(){
        System.out.println("This fish is swimming.");
    }
}