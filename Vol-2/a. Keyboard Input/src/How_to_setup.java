public class How_to_setup {
    // throws java.io.IOException skal tilføjes
    public static void main(String[] args) throws java.io.IOException {

        // 1. Variabel der opbevare det der aflæses fra keyboard
        char input;

        // 2. Her promptes bruger skal indtaste en char
        System.out.println("Enter a char from keyboard: ");

        // 3. char aflæses fra keyboard, og gemmes i en input variabel
        input = (char)System.in.read();

        // 4. Her printes det der er aflæst
        System.out.println("you entered " + input);



        // ----- Her testes hvad der er indtastet ----- //

        if (input == '1')
        {
            System.out.println("You HAVE entered 1");
        } else if (input != '1' ) {
            System.out.println("You did not type in the number 1!");
        }


    }
}