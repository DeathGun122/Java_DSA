import java.util.*;

public class rock_paper_scizzors {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scizzors"};
        String playerChoice, computerChoice, playAgain;

        System.out.println("Welcome to Rock, Paper, Scizzors!");

        do{        
            System.out.println("Enter your choice (Rock, Paper, Scizzors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scizzors")) {

                System.out.println("Invalid choice!");

            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("The computer chose: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if(
                (playerChoice.equals("rock") && 
                computerChoice.equals("scizzors")) ||
                (playerChoice.equals("paper") && 
                computerChoice.equals("rock")) ||
                (playerChoice.equals("scizzors") && 
                computerChoice.equals("paper"))
            ){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}