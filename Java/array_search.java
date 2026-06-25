
import java.util.Scanner;

public class array_search {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Create an array of integers

        // int target = 5; // The number to search for
        // boolean isFound = false;
        // for(int i = 0; i < numbers.length; i++) {
        //     if(numbers[i] == target){
        //         System.out.println("The number " + target + " is at index " + i);
        //         isFound = true;
        //         break;
        //     }
        // }

        // if(!isFound){
        //     System.out.println("The number " + target + " is not in the array.");
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println("The number " + target + " is at index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("The number " + target + " is not in the array.");
        }

        scanner.close();
    }
}