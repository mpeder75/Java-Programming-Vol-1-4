public class Main {
    public static void main(String[] args) {
        /*
        Write a program that converts inches to feet.
        Start at 1 inch and continue in the pattern 1 inch, 2 inches, 3 inches, 4 inches. . .20 inches.
        The output should look like:

        1 inches is equal to < answer> feet
        2 inches is equal to < answer> feet
        3 inches is equal to < answer> feet
        4 inches is equal to < answer> feet
        5 inches is equal to < answer> feet
        <<continue converting and printing up to 20 inches>>

        Note: There is a blank line inserted after every 4th printed entry.
         */

        int i;
        int counter = 0;
        double feet;

        for(i = 1; i <= 20; i++)
        {
            // konvertere inches til feet, som gemmes i variabel feet
            feet = i / 12d;

            // tekst printes
            System.out.println( i + " inches is equal to " + feet + " feet" );

            // Ved hver iteration bliver counter incrementet
            counter++;

            // Der tjekkes, at når counter er 4 så indsættes en ekstra linje, og counter nulstilles
            if (counter == 4)
            {
                System.out.println("\n" + "------------ Blank line every 4 iteration ---------" + "\n");
                counter = 0;
            }
        }

    }
}