public class Main {
    public static void main(String[] args) {
        /*
        Declare an integer named length and initialize it to 10 on the same line.

        On the same line, declare and initialize two more integers named "width" and "height" ,
        and Initialize these to 12 and 15.

        Declare a final integer named "volumen" and initialize to be equal to "length * width * height"

        The "volume" variable is dynamically initialized to a value that is
        calculated when the program runs.

        Print out the value of the volume to the screen.
         */


        int length = 10, width = 12, height = 15;

        int volume = length * width * height;

        System.out.println("the volume of: length=" + length + " height=" + height +
                " length=" + length + " \nis: " + volume);

    }
}