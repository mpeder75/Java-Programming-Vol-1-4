public class Multi_Line_For_loops {
    public static void main(String[] args) {


        // Her tages loop variablen (i) som ganges med sig selv
        // første iteration i = 1 - i squared = 1
        // anden iteration i = 2 - i squared = 4

        int i;
        int square;

        for (i = 1; i <= 10; i++) {
            square = i * i;
            System.out.println("i is equal to "+ i + " ,and " + i +" squared is " + square);
            System.out.println("I love the moon\n");
        }

    }
}
