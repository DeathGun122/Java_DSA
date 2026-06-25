import java.util.Scanner;

public class array_input {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // String[] foods = new String[3];

        // foods[0] = "Pizza";
        // foods[1] = "Burger";
        // foods[2] = "Salad";

        // for(int i = 0; i < foods.length; i++) {
        //     System.out.println("I like " + foods[i]);
        // }
        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.print("Enter the number of foods: ");
        int numFoods = scanner.nextInt();
        scanner.nextLine();

        foods = new String[numFoods];
        for (int i = 0; i < numFoods; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.next();
        }

        for (String food : foods) {
            System.out.println("I like " + food);
        }
        scanner.close();
    }
}
