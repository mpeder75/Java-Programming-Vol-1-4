public class Special_behavior {
    // throws java.io.IOExecption
    public static void main(String[] args) throws java.io.IOException {

        /* ------ Setup så der kan aflæses flere keyboard inputs ------- */

        char input;
        int input2;

        System.out.println("Press any key, the press ENTER: ");
        input = (char) System.in.read();
        System.out.println("You entered: " + input);

        // line buffer læses, og discards
        input2 = System.in.read();
        input2 = System.in.read();

        System.out.println("Press any second key: ");
        input = (char) System.in.read();
        System.out.println("You second input is: " + input);
    }
}

