public class Main {
    public static void main(String[] args) {

        /* ------------  Declare & Initialize array ------------ */
        // Declare og initialize et int array kaldt ages, som assigns størrelse på 5
        int ages[] = new int[5];



        /* ------------  assign array indexes med værdier ------------ */
        // assign ages array indexes med værdier
        ages[0] = 4;
        ages[1] = 5;
        ages[2] = 3;
        ages[3] = 5;
        ages[4] = 7;



        /* ---------  Declare, initialize & assign array på EEN gang --------- */
        double height[] = {2.6, 6.7, 4.4, 5.5};



        /* ------------  Declare & Initialize array ------------ */
        // her printes ages array index 0 til 4 ud
        System.out.println("The first child age is: " + ages[0]);
        System.out.println("The second child age is: " + ages[1]);
        System.out.println("The third child age is: " + ages[2]);
        System.out.println("The fourth child age is: " + ages[3]);
        System.out.println("The fifth child age is: " + ages[4]);


        // Her printes længden af hele array ud
        System.out.println("The total array length is: " + ages.length);



    }
}