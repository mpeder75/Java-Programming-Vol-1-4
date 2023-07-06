public class Main {
    public static void main(String[] args) {

        /*
        reassign            Compound assigment operator
        x = x + y           x += y
        x = x - y           x -= y
        x = x * y           x *= y
        x = x / y           x /= y

        */

        // Declare og initialize variabler
        int x = 2, y = 3;

        // reassign x
        x = x + y;

        System.out.println("new value for x " + x);

        // compound reassign
        x += y;

        System.out.println("new value for x " + x);


    }
}