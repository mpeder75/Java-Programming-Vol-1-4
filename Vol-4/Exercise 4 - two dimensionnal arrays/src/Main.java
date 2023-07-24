public class Main {
    public static void main(String[] args) {

        int tabel[][] = new int[12][2];

        // Måneder bliver lagt i kolonne 1 (som er index 0)
        tabel[0][0] = 1;
        tabel[1][0] = 2;
        tabel[2][0] = 3;
        tabel[3][0] = 4;
        tabel[4][0] = 5;
        tabel[5][0] = 6;
        tabel[6][0] = 7;
        tabel[7][0] = 8;
        tabel[8][0] = 9;
        tabel[9][0] = 10;
        tabel[10][0] = 11;
        tabel[11][0] = 12;

        // Salg for hver måned bliver laget i kolonne 2 (som er index 1)
        tabel[0][1] = 34;
        tabel[1][1] = 44;
        tabel[2][1] = 23;
        tabel[3][1] = 76;
        tabel[4][1] = 65;
        tabel[5][1] = 98;
        tabel[6][1] = 123;
        tabel[7][1] = 102;
        tabel[8][1] = 87;
        tabel[9][1] = 43;
        tabel[10][1] = 34;
        tabel[11][1] = 12;

        for (int i = 0; i < tabel.length; i++) {
            // tabel[i][0] styre at køre igennem månederne 0-11
            // tabel[i][1] styre at printe salget hver måned
            System.out.println("Revenue for month " + tabel[i][0] + " revenue was " + tabel[i][1]);
        }
    }
}