public class Exercise_1 {
    /*
    Create a Array with 100 elements, that holds integers.
    Loop through the array, and for each element, store the square of the element index.
    Ex. for element[2], you would store 4.
    Print out the element number and the contents of the array as follows:

    The square of 0 is 0
    The square of 1 is 1 ....
     */

    public static void main(String[] args) {

        int myArray[] = new int[100];

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = i * i;
            System.out.println(i + " squared is:  " + myArray[i]);
        }
    }
}
