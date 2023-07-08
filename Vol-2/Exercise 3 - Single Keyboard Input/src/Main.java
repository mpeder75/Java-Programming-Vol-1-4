public class Main {
    // throws java.io.IOExecpetion
    public static void main(String[] args) throws java.io.IOException {
      /*
      Write a program to have the user type in a lowercase character and
      convert it to uppercase

      Output: "Type in any lowercase letter: "

      Subtract 32 to the lowercase character to change it into upper case.

      Output the following:

      "You typed in the letter :  <lowercase character>"
      "The uppercase version is :  <uppercase character>"
       */

       char lower, upper;

       System.out.println("Type in any lowercase letter: ");

       lower = (char)System.in.read();
       upper = (char)(lower - 32);

       System.out.println("You typed in the following " + lower);
        System.out.println( "The uppercase version is: " +upper);

    }
}