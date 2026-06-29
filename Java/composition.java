public class composition {
    public static void main(String[] args) {
        Car_composition car = new Car_composition("Honda", 2022, "V8");
        System.out.println(car.model + " " + car.year + " " + car.engine.type);
        car.start();
    }
}
class Car_composition {
    String model;
    int year;
    Engine_composition engine;
    Car_composition(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine_composition(engineType);
    }

    void start(){
        engine.start();
        System.out.println("Starting the car.");
    }
}
class Engine_composition{
    String type;
    Engine_composition(String type){
        this.type = type;
    }

    void start(){
        System.out.println("Starting the engine.");
    }
}