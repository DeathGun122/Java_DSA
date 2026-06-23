import java.util.Scanner;

public class for_loop {
    @SuppressWarnings({"ConvertToTryWithResources"})
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        // decrementing loop
        for (int j = 10; j > 0; j--) {
            System.out.println("The value of j is: " + j);
        }

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        for (int k = 0; k < max; k++) {
            System.out.println("The value of k is: " + k);
        }

        scanner.close();
    } 
}