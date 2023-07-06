public class ExerciseMedBogstaver {
    public static void main(String[] args) {

        /*
        Exercise 1
        Write a program that uses a for loop to print out
        the alphabet from A->Z as follows:

        A   a
        B   b
        C   c
        D   d
        ...and on  until Z.

        Note that there is a tab between the columns.
        Uppercase letter is on the left and lowercase on the right.
         */

        // Her opsættes variabler, der skal have char værdier
        char upperCase = 'A';
        char lowerCase = 'a';


        for (int i = 1; i <= 26; i++)
        {
            // først printes nuværende værdi af variabler
            System.out.println(upperCase + "\t" + lowerCase);

            // derefter incrementes variabler, så NÆSTE iteration printer opdaterede variabler
            upperCase++;
            lowerCase++;
        }

    }
}