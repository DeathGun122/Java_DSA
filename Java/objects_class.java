public class objects_class {
    public static void main(String[] args) {
        Car_OS car = new Car_OS();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.color);
        System.out.println(car.isRunning);

        car.isRunning = true;
        System.out.println(car.isRunning);

        car.start();
        car.stop();
    }
}
class Car_OS{
    String make = "Honda";
    String model = "Civic";
    int year = 2022;
    String color = "Red";
    boolean isRunning = false;

    void start(){
        System.out.println("Starting the car.");
        isRunning = true;
    }
    void stop(){
        System.out.println("Stopping the car.");
        isRunning = false;
    }
}