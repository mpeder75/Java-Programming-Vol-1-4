public class Data_Types {
    public static void main(String[] args) {

        /*

        byte	8-bits      -128 til 127
        short	16-bits     -32769 til 32767
        int	    32-bits     -2147483648 til 2147483647
        long	64-bits     -9223372036854775808 til 9223372036854775808

        !! HUSK når ALLE datatyper med tal assignes med en integer
        !! Derfor er det vigtigt med long, at der bruges prefix l/L

         */

        byte byteVariabel = 100;
        short shortVariabel = -32000;
        int intVariable = 155000;
        long longVariable = 5000000000L;

        System.out.println(longVariable);


        // Her lægges der 10 til variablen
        longVariable = longVariable + 10;
        System.out.println(longVariable);


    }
}