public class Main {

    /*
    Create an 8 element array with the following data:
    12, 43, 54, 2, 7, 33, 65, 4

    Use an enhanced for loop to search through this array and print out
    the maximum and minimum elements of the array.
    */

    public static void main(String[] args) {

        // Array oprettes, med de oplyste tal
        int myArray[] = {12, 43, 54, 2, 7, 33, 65, 4};

        // Max og min variabler oprettes, og assignes begge til det første element i array
        // Hvorfor?? Ford vi jo skal bruge tal til at sammen ligne med hver gang vi looper
        int smallest = myArray[0];
        int largest = myArray[0];

        // For Each Loop hvor der tjekkes om elementerne er mindre eller større end iteration
        for (int element : myArray) {

            if (element < smallest) {
                smallest = element;
            } else if ( element > largest) {
                largest = element;
            }
        }

        System.out.println("The smallest value is: " + smallest);
        System.out.println("The largest value is: " + largest);
    }
}