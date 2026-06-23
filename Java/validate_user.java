import java.util.Scanner;

public class validate_user {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        
        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Invalid username. It must be between 4 and 12 characters.");
        } else if(username.contains(" ") || username.contains("_"))   {
            System.out.println("Invalid username. It cannot contain spaces or underscores.");
        } else {
            System.out.println("Username is valid.");
        }

        scanner.close();
    }
}