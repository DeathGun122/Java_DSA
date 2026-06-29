public class getter_setter{
    public static void main(String[] args) {
        Car_getter_setter car = new Car_getter_setter("BMV", "Red", 50000);

        // car.model = "Honda";
        // System.out.println(car.model + " " + car.color + " " + car.price);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        car.setColor("Blue");
        car.setPrice(60000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}

class Car_getter_setter{
    private final String model;
    private String color;
    private int price;

    Car_getter_setter(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if(price < 0){
            System.out.println("Price cannot be negative.");
        }
        else{
            this.price = price;
        }
    }
}