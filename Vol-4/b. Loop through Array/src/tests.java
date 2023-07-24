public class tests {

    public static void main(String[] args) {

        /* ------- Assign elementer med For loop -------- */

        // Ved hver iteration -> myArray[i] ex. index 2
        // Vil elementet nummeret (2) blive gange med sig selv( 2*2 ), og gemt i index 2

        int myArray[] = new int[10];

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = i * i;
            System.out.println(i + " times " + i + " equal " + myArray[i]);
        }


        /* ------- Finde max værdien i et array med For loop -------- */

        // Comparison variabel, vi skal sammenligne med noget i array, vi bruger elementet i index 0
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] > i) {
                max = myArray[i];
            }
        }
        System.out.println("Max value is now set at " + max);

    }
}
