public class Single_Line_For_Loops {
    public static void main(String[] args) {

        int counter;

        // For loop der looper fra 0 til 10
        for (counter = 0; counter <= 10; counter++)
        {
            System.out.println("The counter is at " + counter);
        }


        // For loop hvor man starter på 5 og tæller op til 10
        for (int i = 5; i <= 10; i++)
        {
            System.out.println("The counter is at " + i);
        }


        // Increment loop variabel med 2 for hver iteration
        for (int y = 5; y <= 10; y = y +2)
        {
            System.out.println("The counter is at : " + y);
        }


        // Loope baglæns fra -10 til 0
        for (int i = -10; i <= 0; i++)
        {
            System.out.println("The counter is " + i);
        }


        //Loope fra 100 til 50, hvor der decrementes med 10 hver gang
        for (int i = 100; i >= 50; i = i - 10)
        {
            System.out.println("The counter is " + i);
        }


    }
}