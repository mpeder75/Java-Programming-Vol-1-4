public class Main {
    public static void main(String[] args) {
        /*
        Alter the program you wrote in Exercise 2, so the output is as follows:

        1 inch is equal to <answer>  feet.
        2 inches is equal to <answer> feet.
        3 inches is equal to <answer> feet .
        4 inches is equal to <answer> feet.

        5 inches is equal to <answer> feet .
        <continue converting and printing up to 20 inches>

        Note: Notice that it prints "1 inch" and ALL other entries use "inches" such as "s inches" etc.
         */

        int i;
        int counter = 0;
        double feet;

        for (i = 1; i <= 20; i++) {
            // konvertere inches til feet, som gemmes i variabel feet
            feet = i / 12d;

            // Hvad der printes hvis: i = 1
            if (i == 1) {
                System.out.println(i + " inch is equal to " + feet + " feet");
            }

            // Hvad der printes hvis: i != 1
            if (i != 1) {
                System.out.println(i + " inch is equal to " + feet + " feet");
            }

            // Ved hver iteration bliver counter increment
            counter++;

            // Der tjekkes, at når counter er 4 så indsættes en ekstra linje, og counter nulstilles
            if (counter == 4) {
                System.out.println();
                counter = 0;
            }
        }

    }
}