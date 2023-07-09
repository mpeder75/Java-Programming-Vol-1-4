import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Write a program that asks the user to input their age.
        Based on the input, calculate how old they will be in 14 more years.

        Output the result as follows:

        "You are now (current age] years old.
        In 14 years, you will be [answer] years old. "

         */

        Scanner scanner = new Scanner(System.in);

        int currentAge = 0;
        int ageIn14Years = currentAge + 14;

        System.out.println("Enter your age" );

        if (scanner.hasNextInt() == true) {
            currentAge = scanner.nextInt();
        } else {
            System.out.println("No integer input");
        }

        System.out.println("Your age in 14 years is: " + ageIn14Years);

    }
}