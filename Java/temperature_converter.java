import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            
            double temp, newTemp;
            String unit;

            System.out.print("Enter the temperature: ");
            temp = sc.nextDouble();

            System.out.print("Enter the unit (C/F): ");
            unit = sc.next().toLowerCase();

            newTemp = (unit.equals("f")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
            unit = (unit.equals("f")) ? "C" : "F";

            System.out.printf("The temperature in %s is: %.2f %s\n", unit, newTemp, unit);
            sc.close();
        }
    }
}
