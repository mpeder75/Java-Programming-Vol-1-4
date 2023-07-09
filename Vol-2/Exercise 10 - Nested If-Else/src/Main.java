import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Write a program that asks how many states are in the USA.
        If they guess anything other than the correct answer (50),
        then use a nested if statement to tell them if their guess
        was too low or too high.
         */

        // Guess variabel
        int guess = 0;

        // Scanner initializeres
        Scanner scanner = new Scanner(System.in);

        // Prompte bruger input
        System.out.println("Who many states are ther in the US? (Enter a number)");

        // Tjek om der indtastes en int
        if (scanner.hasNextInt() == true) {
            guess = scanner.nextInt();
        }

        // Nested if
        if (guess == 50) {
            System.out.println("Correct");
        } else {
            if (guess != 50) {
                System.out.println("Wrong");
            }
        }
    }
}


