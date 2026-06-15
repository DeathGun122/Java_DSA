import java.util.Scanner;

public class if_statements {
    public static void main(String[] args) {
        int age;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            age = sc.nextInt();

            sc.close();
        } 
        if(age >= 100) {
            System.out.println("You are very old");
        }
        else if(age >= 18) {
            System.out.println("You are old enough to vote");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else if(age < 0) {
            System.out.println("You are not yet born");
        }
        else {
            System.out.println("You are not old enough to vote");
        }
    }
}