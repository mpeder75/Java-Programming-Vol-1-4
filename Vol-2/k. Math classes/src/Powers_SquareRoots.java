public class Powers_SquareRoots {
    public static void main(String[] args) {

        /* ---------- Math.pow ----------- */

        // Math.pow - kræver der passes to argumenter
        // double a er grundtal
        // double b er potens

        // Her opløftes 2^4
        double a = 2.0;
        double b = 4.0;

        System.out.println(Math.pow(a, b));

        //Eller

        System.out.println(Math.pow(2, 4));


        /* ---------- Math.sqrt ----------- */

        // Math.sqrt - tager en double som argument
        // Her tages kvadratroden af 4

        double number = 945.0;

        System.out.println("Square root of " + number + " is " + Math.sqrt(number));

        // Eller direkte

        System.out.println(Math.sqrt(945.0));


    }
}
