import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1. Lave variabler
        Write a program that asks the user to guess a number between 1 and 20. The "correct" number is 17.

        2. Logikken i programmet
        If 17 is not entered, the program says that the wrong guess was entered, and tells
        user if the guess was too low or too high.

        If 17 was entered, the program tells the user they were correct .

        3. Logikken skal udføres i en do-while loop
        Wrap the relevant code inside Of do-while loop so that the user
        can continue to place guesses without re-running the program.
        Use the Scanner cl ass to read in the numeric keyboard entry.
        */

        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int correctNumber = 17;

        do {
            System.out.println("Guess a number between 1 and 20: ");

            if (scanner.hasNextInt()== true)
            {
                guess = scanner.nextInt();
            }

            if (guess < correctNumber) {
                System.out.println("Too Low amigo, try again 😎");
            } else if (guess > correctNumber) {
                System.out.println("Too High cowboy, try again 🙂");
            } else if (guess == correctNumber) {
                System.out.println("Yeah, the hidden number was " + correctNumber + " and you guessed " + guess + " correct!😁😎🙂");
                System.out.println("Program shutting down, go home ET 👽");
               break;
            }
            guess++;
        } while (guess != correctNumber);


    }
}