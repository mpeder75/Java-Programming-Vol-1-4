public class Main {
    public static void main(String[] args) throws java.io.IOException {

        /*

        Exercise 1

        Create a true/false question.
        Output the following:

        "The capital of the United States is Washington, DC?  (Answer T or F):  "

        If the user enters 'T' then output, "Correct!
        If user answers 'F' , then output, " Incorrect ! "

         */

        char answer;

        System.out.println("The capital of USA is Washington, DC? (Answer T or F) ");

        answer = (char)System.in.read();

        if (answer == 'T')
        {
            System.out.println("Correct 😎");
        } else {
            System.out.println("Incorrect");
        }
    }
}