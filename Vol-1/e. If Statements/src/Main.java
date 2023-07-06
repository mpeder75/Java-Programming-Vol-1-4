public class Main {

    public static void main(String[] args) {


        // ------ If Statement ------//

         /*
        If statement tjekker om condition er true - HVIS det er vil codeblock blive udført
         */

        int x = 3;
        int y = 4;

        //  ----- Større end ----- //
        if (x < y) System.out.println("X is less than y");

        // ----- Lig med ----- //
        if (x == y) System.out.println("x is equal to y");

        double a = 3.45;
        double b = 4.25;
        double c = 3.45;

        //  ----- Større eller lig med ----- //
        if (b >= c) System.out.println("b is greater than or equals c");

        //  ----- Forskelligt for ----- //
        if (a != b) System.out.println("a is not equal to c");

    }
}
