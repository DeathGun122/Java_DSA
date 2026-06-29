public class interfaces{
    public static void main(String[] args) {

        Rabbit_interfaces rabbit = new Rabbit_interfaces();
        rabbit.flee();

        Hawk_interfaces hawk = new Hawk_interfaces();
        hawk.hunt();

        Fish_interfaces fish = new Fish_interfaces();
        fish.flee();
        fish.hunt();
    }
}

interface Prey_interfaces{

    void flee();
}

interface Predator_interfaces{

    void hunt();
}

class Rabbit_interfaces implements Prey_interfaces{

    @Override
    public void flee() {
        System.out.println("The rabbit flees");
    }
}

class Hawk_interfaces implements Predator_interfaces{

    @Override
    public void hunt() {
        System.out.println("The hawk hunts");
    }
}

class Fish_interfaces implements Prey_interfaces, Predator_interfaces{

    @Override
    public void flee() {
        System.out.println("The fish flees");
    }

    @Override
    public void hunt() {
        System.out.println("The fish hunts");
    }
}