import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {
        // declare variables
        double weight, newWeight;
        int choice;

        // Welcome message
        System.out.println("Welcome to the weight converter!");
        System.out.println("1. Convert lbs to kg");
        System.out.println("2. Convert kg to lbs");
        
        // prompt user for weight
        System.out.println("Please select an option:");
        try(Scanner sc = new Scanner(System.in);){
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Please enter your weight in lbs: ");
                    weight = sc.nextDouble();
                    newWeight = weight * 0.45359237;
                    System.out.printf("Your weight in kg is: %.2f kg\n", newWeight);
                }
                case 2 -> {
                    System.out.println("Please enter your weight in kg: ");
                    weight = sc.nextDouble();
                    newWeight = weight * 2.20462262;
                    System.out.printf("Your weight in lbs is: %.2f lbs\n", newWeight);
                }
                default -> System.out.println("Invalid choice");
            }

            sc.close();
        }
    }
}
