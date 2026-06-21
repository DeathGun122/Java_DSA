import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){ 
            
            double principal, rate, amount;
            int timesCompounded, years;

            System.out.print("Enter the principal amount: "); 
            principal = sc.nextDouble();

            System.out.print("Enter the rate: "); 
            rate = sc.nextDouble() / 100;

            System.out.print("Enter the number of times compounded per year: "); 
            timesCompounded = sc.nextInt();

            System.out.print("Enter the number of years: "); 
            years = sc.nextInt();
            
            amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
            System.out.printf("The amount after %d years is $%.2f\n", years, amount);

            sc.close(); 
        }
    }
}
