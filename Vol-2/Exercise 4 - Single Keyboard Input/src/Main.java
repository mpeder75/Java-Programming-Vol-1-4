public class Main {
    public static void main(String[] args) throws java.io.IOException {

        int rawInput, count;
        char letter;

        // Prompte efter keyboard input
        System.out.println("Enter any CAPITAL letter from the keyboard: ");
        // Input aflæses og gemmes i variabel rawInput
        rawInput = System.in.read();

        // Printe overskrift til tabel
        System.out.println("Letter\t\tASCII Value");

        // For loop: count sætte lig med det bruger indtaster !! Som læses som et tal ex. 65
        // For loop: condition er at count ikke må være større end 90 (90 er Z i ASCII)
        //For loop: letter sættes til count og castes til en char, så man kan printe lowercase
        for (count = rawInput; count <= 90; count++)
        {
            letter = (char) count;
            System.out.println(letter + "\t\t\t" + count);
        }

        /*
        1. Bogstaver har en ASCII værdi fra 65 til 90
        2. Hvis man indtaster U i linje 8 - Har U værdien 85 i ASCII
        3. Alfabetet slutter i ASCII 90
            a. Dette er for loopets condition -> Exit hvis count er større end 90
        4. letter = (char) count er
         */

    }
}