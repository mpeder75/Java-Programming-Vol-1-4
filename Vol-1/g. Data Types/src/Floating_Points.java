public class Floating_Points {

    public static void main(String[] args) {

        /*

        float 32 bits
        double 64 bits

        float: er den originale decimal datatype
        double: er kommet til senere, og kan indeholde mere, ER STANDARD datatype for decimal

        At have flere forskellige datatyper kan være godt når man arbejder med embedded devices

        HUSK at bruge prefix for float f/F, da alle decimaltal declares som double

        */

        // Her declares og assignes to double variabel

        double num1 = 74.33;
        double answer;

        // Her beregnes kvardratroden
        answer = Math.sqrt(num1);

        System.out.println("Squareroot of " + num1 + " is " + answer);







    }
}
