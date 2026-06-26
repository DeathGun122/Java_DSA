import java.util.Scanner;

public class quiz_game {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String[] questions = {
            "What is the main function of a router?",
            "Which part of a computer is the brain?",
            "When was Facebook founded?",
            "Who is known as the Father of computers?",
            "What is the first programming language that was created?"
        };
        String[][] options = {
            {
                "1. Storing files", 
                "2. Encrypting data",
                "3. Sending emails",
                "4. Routing packets to the correct destination"
            },
            {
                "1. CPU", 
                "2. Memory",
                "3. Keyboard",
                "4. Monitor"
            },
            {
                "1. 2004", 
                "2. 2003",
                "3. 2002",
                "4. 2001"
            },
            {
                "1. Steve Jobs", 
                "2. Alan Turing",
                "3. Charles Babbage",
                "4. Larry Page"
            },
            {
                "1. Cobol", 
                "2. Fortran",
                "3. Assembly",
                "4. C"
            }
        };

        int[] answers = {4, 1, 1, 3, 2};
        int score = 0, guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("**********************************");

        for(int i = 0; i < 5; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            
            System.out.print("Enter your answer (1-4): ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Your final score is " + score + "/5.");        

        scanner.close();
    }
}