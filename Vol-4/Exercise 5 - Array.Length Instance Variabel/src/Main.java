public class Main {

    /*
    Create an one dimensional array With the following floating point data:
    332.1
    55.4
    76.4
    88.5
    45.3
    88.8
    76.7

    Use a for loop that utilizes the length instance variable for this array,  to print the contents of this array.
    Next, add a few additional values to the array
    and verify that the print loop continues to function properly.
    */

    public static void main(String[] args) {

     double myArray[] = {332.1, 55.4, 76.4, 88.5, 45.3, 88.8, 76.7 };

     for (int i = 0; i <= myArray.length-1; i++) {
         System.out.println("Index " + i + " has the value of: " + myArray[i]);
     }

    }
}