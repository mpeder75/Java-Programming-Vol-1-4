import java.util.Scanner;

public class Main {
    /*
    In the main method, ask the user to separately input two integers from 1 to 100.
    Store the user input into 2 variables.

    Create a method that will take as parameters these two values and determine which one is the larger number.
    The method will then return the larger of the numbers and display the answer to the user.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number between 1 - 100");
        int input1 = scanner.nextInt();

        System.out.println("Enter second number between 1 - 100");
        int input2 = scanner.nextInt();

        int answer = biggestNumber(input1, input2);
        System.out.println("You entered " + input1 + " and " + input2 + ", where the largest is: " + answer);
    }

    public static int biggestNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}