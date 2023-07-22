public class Main {
    public static void main(String[] args) {

        /* ---------------- Loope igennem Array ------------- */

        // Array declares og initializes med 6 elementer / 5 indexes
        double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};


        // For loop der looper igennem array
        // LÆG mærke til at hvis i < grades.length så skal der exit loop
/*
        for (int i = 0; i <= grades.length; i++)
        {
            System.out.println("Grade number: " + i + " is " + grades[i]);
        }


 */



        /* ---------------- Loope BAGLÆNS igennem Array ------------- */

/*
        for (int i = grades.length-1; i >= 0; i--)
        {
            System.out.println(grades[i]);
        }


 */

        /* ---------------- Populate array med for loop ------------- */

        // Array med 10 indexes
        int numbers[] = new int[10];
/*
        // For loop der looper gennem array
        // ved hver iteration tages selve iteration, og plusses med 10
        // dvs. 1+10, 2+10, 3+10 - som gemmes som værdier på index 0, 1, 2
        for (int i = 0; i <=9; i++)
        {
           numbers[i] = i +10;
            System.out.println(numbers[i]);
        }

*/

        /* ---------------- Max værdien i et array med for loop ------------- */
/*
        double myGrades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};

        // Variabel der opbevare den højeste værdi der er fundet i array
        // Man starter med at gemme index 0 og skifter så løbende ud, når en der er større findes
        double max = myGrades[0];

        // For loop,
        // der i condition har at man tjekker indtil grades.length-1 nås, efter skal der ud af loop
         for (int i = 0; i <= grades.length-1; i++) {

            /* HVIS grades[i] (som er den iteration man tjekker mod), er større end max variablen,
            så sættes max variablen til den nuværende grades[i] */
/*            if (grades[i] > max) {
              max = grades[i];
            }

            System.out.println("The max grade in the class is " + max);
 */


        /* ---------------- Min værdien i et array med for loop ------------- */

        double hisGrades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};

        // Variabel der opbevare den laveste værdi der er fundet i array
        // Man starter med at gemme index 0 og skifter så løbende ud, når en der er større findes
        double min = hisGrades[0];

        // For loop,
        // der i condition har at man tjekker indtil grades.length-1 nås, efter skal der ud af loop
        for (int i = 0; i <= hisGrades.length - 1; i++) {

            /* HVIS grades[i] (som er den iteration man tjekker mod), er mindre end min variablen,
            så sættes min variablen til den nuværende grades[i] */
            if (hisGrades[i] < min) {
                min = hisGrades[i];
            }

            System.out.println("The min grade in the class is " + min);
        }
    }
}
