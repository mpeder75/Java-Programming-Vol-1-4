public class Main {
    public static void main(String[] args) {

        /*
        Da arrays bliver implementer som objekter, vil der også være methods, instance variabels ect.

        .Length -> Denne viser hvor mange indexes der er i array
        */

        int jason[] = {4, 5, 6, 7, 12, 3, 87, 4, 1, 9, 6, 4, 11, 77, 88, 43, 2, 1, 6, 73, 44, 32, 8, 9};

        // Her printes hele længde af array ud - 24 indexes
        System.out.println("The total length of the array is: " + jason.length);

        // Loope igennem array med .length instance variabel
        for (int i = 0; i <= jason.length-1; i++) {
            System.out.println(jason[i]);
        }




    }
}