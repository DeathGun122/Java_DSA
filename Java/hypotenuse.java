
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        double a, b, c;
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the length of side a: ");
            a = sc.nextDouble();
            System.out.println("Enter the length of side b: ");
            b = sc.nextDouble();
            sc.close();
        }

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The length of the hypotenuse is: " + c);
    }
}
