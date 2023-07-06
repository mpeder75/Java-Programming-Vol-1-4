public class Main {
    public static void main(String[] args) {

        /*

        Create a boolean variable called "bool".
        Assign a value of true to this variable.
        If bool is equal to true, then output the following to the screen 4 times using a loop.
        Make sure to pass the bool variable to the println() statement to print to the screen.

        The value of the variabel is true
        The value of the variabel is true
        The value of the variabel is true
        The value of the variabel is true

        If the value of bool is false, output the following line 4 times :

        The value if the variabel is false
        The value if the variabel is false
        The value if the variabel is false
        The value if the variabel is false

        Change the value of bool from true to false and re-run the program.

         */

        boolean bool = false;

        if (bool) {
            for (int i = 0; i <= 3; i++) {
                System.out.println("The Value of the variabel is true");
            }
        } else {
            for (int i = 0; i <= 3; i++) {
                System.out.println("The Value of the variabel is false");
            }
        }
    }
}