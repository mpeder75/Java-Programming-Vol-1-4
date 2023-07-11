public class Main {
    public static void main(String[] args) {

        /* ---- Remainder operator returnere hvad der er i rest efter division ---- */

        // her divideres 4/3 - og der returneres 1
        System.out.println(4 % 3);

        // her divideres 10/2 - og der returneres 0 (da der ikke er rest)
        System.out.println(10 % 2);




        /* ---- Continue operator returnere hvad der er i rest efter division  ---- */

        for (int i = 0; i <= 30; i++)
        {
            continue;   // ALT efter continue statement bliver sprunget over
                        // Derefter springer man op i loop condition igen, og påbegynder næste iteration
        }


        // ------ eksempel ------- //

        for (int i = 0; i <= 30; i++) {
            // Hvis i kan divideres med 5 (hvis division med 5 giver en rest på 0)
            if (i % 5 == 0) {
                System.out.println("The number " + i + " is divisible with 5");
                // continue gør at der hoppes tilbage til loop condition
                continue;
            }

            System.out.println(i);
        }


    }
}