
import java.util.Scanner;

public class while_loop {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";
        while(!response.equalsIgnoreCase("Q")) {
            System.out.println("You are playing a game. ");
            System.out.print("Press 'Q' to quit the game: ");
            response = scanner.nextLine().toUpperCase();
        }

        scanner.close();
    }
}
