import java.util.Scanner;

public class range_check {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do { 
              System.out.print("Enter a number between 1 and 100: ");
                if (scanner.hasNextInt()) {
                 number = scanner.nextInt();
                 if (number < 1 || number > 100) {
                      System.out.println("Invalid input. Please try again.");
                 }
                } else {
                 System.out.println("Invalid input. Please enter an integer.");
                 scanner.next(); // Clear the invalid input
                }
        } while (number < 1 || number > 100);
        scanner.close();
    }
}
