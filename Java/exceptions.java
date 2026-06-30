import java.util.*;

public class exceptions {
    public static void main(String[] args) {
        
        // try{
        //     System.out.println(5 / 0);   
        // }
        // catch(ArithmeticException e){
        //     System.out.println("You can't divide by zero!");
        // }    
    
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter another number: ");
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a number.");
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        catch(Exception e){
            // catch all exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Goodbye!");
        }
    }
}