public class abstract_{
    public static void main(String[] args) {
        // Shape_abstract shape1 = new Shape_abstract();

        Circle_abstract circle = new Circle_abstract(5);
        Rectangle_abstract rectangle = new Rectangle_abstract(10, 5);
        Triangle_abstract triangle = new Triangle_abstract(10, 5);

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();
    }
}

abstract class Shape_abstract{
    abstract double area();
    void printArea(){   // concrete method
        System.out.println("The area is: " + area());
    }
}

class Circle_abstract extends Shape_abstract{

    double radius;

    Circle_abstract(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle_abstract extends Shape_abstract{
    double base, height;

    Rectangle_abstract(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return base * height;
    }
}

class Triangle_abstract extends Shape_abstract{
    double base, height;

    Triangle_abstract(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }
}