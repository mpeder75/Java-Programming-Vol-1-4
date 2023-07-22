public class Main {
    /*
    Create an array with 100 elements that will hold integer values.
    Loop through the array and for each element, store the square of the element index.

    For example, for element[2]  you would store value of 4 in that location.
    For element[3] store 9 and so on
    Print out the element number and the contents of the array to  the screen as follows:

    The square of 0 is 0
    The square of 1 is 1
    The square of 2 is 4
    … and so on for the entire array
     */

    public static void main(String[] args) {

        // Array med 100 elementer, der har index 0 - 99
        int squares[] = new int[100];


        for (int i = 0; i < squares.length; i++) {

            // For hvert iteration så assignes den værdi den har af indxex med tallet ganget
            // ex. myArray[2] = 2 * 2
            squares[i] = i * i;

            // Her printes iteration squared, ved HVER iteration
            System.out.println("The square of " + i + " is " + squares[i]);

        }
    }
}
