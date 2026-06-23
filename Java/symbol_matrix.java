import java.util.Scanner;

public class symbol_matrix {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int rows, cols;
        char symbol;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        sc.close();
    }        
}