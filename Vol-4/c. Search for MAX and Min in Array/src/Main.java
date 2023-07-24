public class Main {
    public static void main(String[] args) {

        // array med 14 elementer
        int largeArray[] = {8, 11, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54};

        // Variabel der skal opbevare den mindste værdi,
        // initializers til første index i array (da man jo skal have noget at sammenligne med)
        int smallest = largeArray[0];
        int largest = largeArray[0];


        for (int i = 0; i < largeArray.length; i++) {

            if (largeArray[i] < smallest) {
                smallest = largeArray[i];
            } else if (largeArray[i] > largest) {
                largest = largeArray[i];
            }
        }

        System.out.println("smallest value in array is: " + smallest);
        System.out.println("largest value in array is: " + largest);
    }
}
