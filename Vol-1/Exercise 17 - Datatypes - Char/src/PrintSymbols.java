public class PrintSymbols {
    public static void main(String[] args) {

        char symbols = '!';

        for (int i = 33; i <= 64; i++)
        {
            System.out.println("Current symbol " + symbols);
            char newSymbol = symbols++;

        }


    }
}
