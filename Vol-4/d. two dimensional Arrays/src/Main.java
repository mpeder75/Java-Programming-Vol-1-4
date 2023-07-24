public class Main {

    /*
            2   4   8   4
            11  12  9   -5
            10  3   2   -2
     */

    public static void main(String[] args) {

        // 2 dim array, det første er antal rækker(3), næste er antal kolonner(4)
        int tabel[][] = new int[3][4];



        // Nu vil vi indsætte øverste linje fra tabel ovenfor
        tabel[0][0] = 2;
        tabel[0][1] = 4;
        tabel[0][2] = 8;
        tabel[0][3] = 4;

        // indsætte midterste linje fra tabel ovenfor
        tabel[1][0] = 11;
        tabel[1][1] = 12;
        tabel[1][2] = 9;
        tabel[1][3] = -5;

        // indsæt nederste linje fra tabel ovenfor
        tabel[2][0] = 10;
        tabel[2][1] = 3;
        tabel[2][2] = 3;
        tabel[2][3] = -2;

        // Printe øverste linje fra tabel
        System.out.println("num1:" + "\t" + "num2:" + "\t" + "num3:" + "\t" + "num4:");
        System.out.println(tabel[0][0] + "\t\t" + tabel[0][1] + "\t\t" + tabel[0][2] + "\t\t" + tabel[0][3]);
        System.out.println(tabel[1][0] + "\t\t" + tabel[1][1] + "\t\t" + tabel[1][2] + "\t\t" + tabel[1][3]);
        System.out.println(tabel[2][0] + "\t\t" + tabel[2][1] + "\t\t" + tabel[2][2] + "\t\t" + tabel[2][3]);



    }
}