public class Main {
    public static void main(String[] args) throws java.io.IOException{

        char input1;
        char input2;

        System.out.println("Is it Sunny outside? (Y or N and press ENTER) ");
        input1 = (char) System.in.read();

        // For clearing buffer
        input2 = (char)System.in.read();

        System.out.println("Is it warm outside? (Y or N and press ENTER) ");
        input2 = (char) System.in.read();

        if (input1 == 'Y' && input2 == 'Y')
        {
            System.out.println("It is sunny and warm outside");
        } else if (input1 == 'Y' && input2 == 'N')
        {
            System.out.println("It is sunny and cold outside");
        } else if (input1 == 'N' && input2 == 'Y')
        {
            System.out.println("It is cloudy and warm outside");
        } else if (input1 == 'N' && input2 == 'N')
        {
            System.out.println("It is cloudy and cold outside");
        }


    }
}