public class Main {
    public static void main(String[] args) {

     /*

     &&     Logical AND     "A and B" both needs to be true
     ||     Logical OR      "A or B" only one needs to be true
     !      Logical NOT     "Invert state"
     ^      Logical XOR     "A or B but not both" -> Only one cna bew true

     */

        int a = 10;
        boolean b = true;


        // --------- Logical NOT ! --------- //
        if (a != 20)
        {
            System.out.println("a is not 20!");
        }


        // --------- Logical AND && --------- //
        if ((a == 10) && (b == true))
        {
            System.out.println("a is 10 and b is true");
        }

        // --------- Logical AND && --------- //
        if ((a < 20) || (b != true))
        {
            System.out.println("a is smaller than 10 -- OR -- b is NOT true");
        }

        // --------- Logical XOR ^ --------- //
        if ((a == 20) ^ (b == true))
        {
            System.out.println("Either a ==c 10 is true or Either B == true -- ONLY ONE can be true");
        }









    }
}