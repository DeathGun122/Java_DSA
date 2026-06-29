public class polymorphism {
    public static void main(String[] args) {
        Car_polymorphism car = new Car_polymorphism();
        Boat_polymorphism boat = new Boat_polymorphism();
        Bike_polymorphism bike = new Bike_polymorphism();
        
        Vehicle_polymorphism[] vehicles = {car, boat, bike}; //polymorphism

        for (Vehicle_polymorphism vehicle : vehicles) {
            vehicle.go();
        }
    }
}
// abstract class Vehicle_polymorphism{

//     abstract void go();
// }

interface Vehicle_polymorphism{
    void go();
}

class Car_polymorphism implements Vehicle_polymorphism{

    @Override
    public void go() {
        System.out.println("The car goes");
    }
}

class Boat_polymorphism implements Vehicle_polymorphism{

    @Override
    public void go() {
        System.out.println("The boat goes");
    }
}

class Bike_polymorphism implements Vehicle_polymorphism{

    @Override
    public void go() {
        System.out.println("The bike goes");
    }
}