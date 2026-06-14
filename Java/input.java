import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Your name is: " + name);
            
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
            
            System.out.println("Enter your GPA: ");
            double gpa = sc.nextDouble();
            System.out.println("Your GPA is: " + gpa);
            
            System.out.println("Are you a student: ");
            boolean isStudent = sc.nextBoolean();
            System.out.println("You are a student: " + isStudent);
            
            if(isStudent){
                System.out.println("You are enrolled as a student.");
            }
            else{
                System.out.println("You are not enrolled as a student.");
            }
            
            System.out.println("Enter your favorite color: ");
            String color = sc.next();
            System.out.println("Your favorite color is: " + color);

            sc.close();
        }
    }
}
