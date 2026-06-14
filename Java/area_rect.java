import java.util.Scanner;

public class area_rect {
    public static void main(String[] args) {
        
        double width, height, area;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the width: ");
            width = scanner.nextDouble();
            System.out.print("Enter the height: ");
            height = scanner.nextDouble();
            area = width * height;
            System.out.println("The area of the rectangle is: " + area);
            scanner.close();
        }
    }
}
