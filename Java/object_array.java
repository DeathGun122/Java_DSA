public class object_array {
    public static void main(String[] args) {
        // Car car1 = new Car("BMW", "Red");
        // Car car2 = new Car("Audi", "Blue");
        // Car car3 = new Car("Mercedes", "Black");
        
        // Car[] cars = {car1, car2, car3};

        Car[] cars = {
            new Car("BMW", "Red"),
            new Car("Audi", "Blue"),
            new Car("Mercedes", "Black")
        };
        
        for(Car car: cars){
            car.drive();
        }
    }
}

class Car{
    String model;
    String color;
    
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + model + " in the " + color + " color.");
    }
}