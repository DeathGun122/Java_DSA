import java.util.*;

public class foodlist {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enetr the nos. of food you would like to enter: ");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numOfFoods; i++){
            System.out.print("Enter food no. " + (i + 1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
