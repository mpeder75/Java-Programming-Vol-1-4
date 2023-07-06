public class Main {
    public static void main(String[] args) {

        /*
        Write a program that uses a for loop to output the following countdown.
        Notice there ius a blank line between every number

        10

        9

        ...

        0
         */


        // countDown variabel der opbevare værdien af coundDown
        int countDown;

        // for loop counter variabel initialiseres til 10
        // condition opsættes så længe countDown >= 0 vil der blive itereret
        // EFTER hver iteration vil counter variabel (countDown) decrementeres med 1

        for (countDown = 10; countDown >= 0; countDown--)
        {
            System.out.println(countDown + "\n");
        }



    }
}