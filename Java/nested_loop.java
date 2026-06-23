public class nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Row " + i + ":");
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
