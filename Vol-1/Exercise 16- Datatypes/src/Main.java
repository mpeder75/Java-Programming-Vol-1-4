public class Main {
    public static void main(String[] args) {

        /*
      The java Math class contains a method called pow(x,y)
      This method takes the number "x" and raises it to the power "y".
      X and y are double floating point numbers, and the method returns a double floating point number.

      Write a program that computes the following:
      1.25^1
      1.25^2
      1.25^3  And so on

       Format the output as:
       1.25 raised to the power of is <power> is equal to <answer>.
       Increment the exponent from 1 to 20.
       */

        // Det er exponent vi vil increment ved hver iteration
        double exponent;
        double answer;

        for (exponent = 1; exponent <= 20; exponent++)
        {
            // anwser sættes til at være 1.25 fast, exponent bliver incrementet af loop condition (exponent++)
            answer = Math.pow(1.25, exponent);

            System.out.println("1.25 raised to the power of " + exponent + " is " + answer );
        }

    }
}