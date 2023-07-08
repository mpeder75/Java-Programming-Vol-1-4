public class Main {
    // throws java.io.IOException
    public static void main(String[] args) throws java.io.IOException {

        /*
        Create a "Guess the letter game". Have the user input a letter between A and Z.

        Output : "Im thinking Of a letter between A and Z."
        "Guess my letter: "

        If they guess W or w then output, "Correct!"

        If they guess any ether letter, then output "nope, not Correct'"
         */

        // Variabel der opbevare keyboard gæt
        char guess;

        // Her promptes der skal indtastes bogstav
        System.out.println("Im thinking Of a letter between A and Z.");
        System.out.println("Guess my letter: ");

        // Her aflæses keyboard ionput, og gemmes i variablen guess
        guess = (char) System.in.read();

        // logik
        if ((guess == 'W') || (guess == 'w')) {
            System.out.println("Correct!");
        } else {
            System.out.println("nope, not Correct");
        }
    }
}


