import java.util.Scanner;

public class madlibs{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String adj1, noun1, adj2, verb1, adj3;
            System.out.print("Enter an adjective: ");
            adj1 = scanner.nextLine();
            System.out.print("Enter a noun: ");
            noun1 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            adj2 = scanner.nextLine();
            System.out.print("Enter a verb ending in -ing: ");
            verb1 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            adj3 = scanner.nextLine();
            System.out.println("\nToday I went to a " + adj1 + " zoo.");
            System.out.println("In an exhibit I saw a " + noun1 + ".");
            System.out.println(noun1 + " was " + adj2 + " and " + verb1 + ".");
            System.out.println("I was " + adj3 + "!");

            scanner.close();
        }        
    }
}