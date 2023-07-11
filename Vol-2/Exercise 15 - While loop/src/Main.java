public class Main {
    public static void main(String[] args) {

        /*
        Write a program that uses a while loop, to calculate the sum of all numbers from 1 to 100,
        then output the result to th screen
         */

        // dette er nuværende værdi som bliver incremented ved hver iteration
        int number = 1;

        // variabel der løbende opbevare sum
        int sum = number;

        // while loop der looper indtil 100
        while (number <= 100)
        {
            // Ved hver iteration lægges iterations nummeret til sum variablen
            sum = sum + number;

            // increment loop variabel
            number++;
        }

        System.out.println("Sum og of all numbers  from 1 to 100 is: " + sum);


    }
}