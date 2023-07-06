public class ExerciseMedTal {

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

            char upperCase = 65;
            char lowerCase = 97;


            for (int i = 65; i <= 90; i++)
            {
                System.out.println(upperCase + "\t" + lowerCase);

                upperCase++;
                lowerCase++;
            }

        }
    }

