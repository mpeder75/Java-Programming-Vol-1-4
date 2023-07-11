public class Main {
    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++)
        {
            // if statement med break, der breaker ud af for loop når i = 7
            if (i == 7) {
             break;
            }
            System.out.println("This is loop no: " + i);
        }

        System.out.println("All looping is now done");

    }
}