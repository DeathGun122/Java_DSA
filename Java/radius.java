import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        double radius, area, circumference, volume;
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextDouble();
            sc.close();
        }

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
        
        System.out.printf("The area of the circle is: %.2f\n", area);
        System.out.printf("The circumference of the circle is: %.2f\n", circumference);
        System.out.printf("The volume of the circle is: %.2f\n", volume);
    }
}
