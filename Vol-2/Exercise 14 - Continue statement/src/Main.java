public class Main {
    public static void main(String[] args) {

        /*
        Write a program that uses a for loop with continue statement to print
        ou all even numbers between 1 and 100
         */

        for (int i = 1; i <= 100; i++)
        {
            if (i%2 != 0)
            {
            continue;
            }
            System.out.println("The number " + i + " is dividable with 2");
        }
    }
}