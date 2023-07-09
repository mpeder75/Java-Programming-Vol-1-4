import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
    Write a program that asks the user to enter a guess for your age.
    If the user types in the correct answer, display a message saying they were correct
    If not, show a message saying that their guess was wrong.
    Use your actual age in this program.
     */
        int age = 20;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess my age: ");

        if (scanner.hasNextInt() == true)
        {
            guess = scanner.nextInt();
        }

        if (age == guess)
        {
            System.out.println("My age is " + age + " you guessed " + guess + " that's correct 😎");
        } else if (age != guess) {
            System.out.println("Guess was wrong ⛔");
        }

    }
}