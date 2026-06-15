import java.util.Scanner;
public class shopping_cart {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String item;
            double price, total;
            int quantity;
            char currency = '$';

            System.out.print("What item would you like to buy: ");
            item = sc.nextLine();
            
            System.out.print("What is the price for each item: ");
            price = sc.nextDouble();
            
            System.out.print("How many items do you want to buy: ");
            quantity = sc.nextInt();
            
            total = price * quantity;
            System.out.println("Total: " + currency + total + " for " + quantity + " " + item);

            sc.close();
        }
    }
}
