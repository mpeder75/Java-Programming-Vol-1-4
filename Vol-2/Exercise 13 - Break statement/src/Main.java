public class Main {
    public static void main(String[] args) throws java.io.IOException {
    /*
    Write a program that asks a user to entered their favorite letter of the alphabet.

    Use a for loop to with a break statement to loop through all letters A->Z,
    searching for a match for what the user input.

    Then, display to the user what number that letter corresponds to.

    For example, if the user types in then output "A",  then output,
    Your favorite letter is "A" which is letter number 1 .

    If the user types in then output:
    Your favorite letter is "Y", which is letter number 25.
    */


        char input;                      // variabel der opbevare bruger input
        int i;                           // tællevariabel til forloop - Denne angiver HVAD nummer bogstavet er i alfabetet
        char letterTest = 'A';           // Variabel der sammenligner input mod bogstav i alfabetet


        // Prompte om bruger input
        System.out.println("Enter favorite CAPITAL letter: ");

        // input aflæses af keyboard
        input = (char) System.in.read();

        // loope igennem alfabetet 26 bogstaver
        for (i = 1; i <= 26; i++)
        {
            if (input == letterTest) {  // hvis input er lig nuværende bogstav, break ud
                break;
            }

            letterTest++;               // HVIS IKKE, increments letterTest (til B) og der testes igen
        }

        System.out.println("Your favorite letter is " + input + " and that's number " + i);

    }
}