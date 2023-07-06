public class Chars {

    public static void main(String[] args) {

        /*

        Char datatype indeholder bogstaver (chars)

        Java benytter Unicode som er et bibliotek af bogstaver, tal, symboler

         */


        // char variabel declares
        char character;


        // char variabel assigns
        character = 'A';


        // char variabel printes
        System.out.println(character);



        // Hvis man incrementer char med 1 - Får man B
        character++;
        System.out.println(character);



        // assign character til unicode 85 som er 'U'
        character = 85;
        System.out.println(character);



        // Loop igennem alfabetet
        char starterChar = 'A';
        for (char c = starterChar; c <= 'Z'; c++)
        {
            System.out.println(c + " ");
        }



        // Loop der looper Unicode igennem og caster dem til char
        char bogstav;
        int i;

        for (i = 30; i <= 126; i++) {
            bogstav = (char) i;
            System.out.println("Code is " + i + " corresponds to: " + bogstav);
        }


    }
}
