import java.util.Scanner;

public class email_check {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter your email address: ");
            String email = sc.nextLine();
            if(email.contains("@") && email.contains(".")) {
                System.out.println("Valid email address");
            }
            else {
                System.out.println("Invalid email address");
            }

            String username = email.substring(0, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@') + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
            sc.close();
        }
    }
}
