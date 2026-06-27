public class to_string {
    public static void main(String[] args) {
        Car_to_string car = new Car_to_string("Honda", "Civic", "Red", 2022);
        Car_to_string car2 = new Car_to_string("Honda", "Civic", "Red", 2022);
        System.out.println(car);
        System.out.println(car2);
    }
}

class Car_to_string{
    String make, model, color;
    int year;

    Car_to_string(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}